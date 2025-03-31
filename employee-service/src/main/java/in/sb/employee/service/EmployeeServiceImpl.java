package in.sb.employee.service;

import in.sb.employee.entity.Address;
import in.sb.employee.entity.Employee;
import in.sb.employee.repo.EmployeeRepository;
import in.sb.employee.response.AddressResponse;
import in.sb.employee.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
//added service class
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;
    private final RestTemplate restTemplate;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository, ModelMapper modelMapper, RestTemplate restTemplate) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
        this.restTemplate = restTemplate;
    }

    @Override
    public EmployeeResponse getEmployeeDetails(int id) {
        // Correctly handle the response as a list of Address objects
        Address[] addressArray = restTemplate.getForObject("http://localhost:8086/address", Address[].class);
        List<Address> addresses = List.of(addressArray);

        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
        EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);

        List<AddressResponse> addressResponses = addresses.stream().map(addr -> {
            AddressResponse addressResponse1 = new AddressResponse();
            addressResponse1.setId(addr.getId());
            addressResponse1.setLane1(addr.getLane1());
            addressResponse1.setLane2(addr.getLane2());
            addressResponse1.setState(addr.getState());
            addressResponse1.setZip(addr.getZip());
            return addressResponse1;
        }).toList();
        employeeResponse.setAddressResponse(addressResponses);

        return employeeResponse;
    }
}

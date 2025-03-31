package in.sb.employee.controller;

import in.sb.employee.entity.Employee;
import in.sb.employee.response.EmployeeResponse;
import in.sb.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee/{id}")
    EmployeeResponse getEmployeeDetails(@PathVariable("id") int id) {
         return employeeService.getEmployeeDetails(id);
    }
}

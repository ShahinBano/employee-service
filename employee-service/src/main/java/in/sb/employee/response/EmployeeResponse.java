package in.sb.employee.response;

import in.sb.employee.entity.Address;

import java.util.List;

public class EmployeeResponse {
    private int id;
    private String name;
    private String email;
    private List<AddressResponse> addressResponse;

    public List<AddressResponse> getAddressResponse() {
        return addressResponse;
    }

    public void setAddressResponse(List<AddressResponse> addressResponse) {
        this.addressResponse = addressResponse;
    }

    public EmployeeResponse(int id, String name, String email, List<AddressResponse> addressResponse) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.addressResponse = addressResponse;
    }

    public EmployeeResponse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "EmployeeResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", addressResponse=" + addressResponse +
                '}';
    }
}

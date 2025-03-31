package in.sb.employee.response;

public class AddressResponse {
    private int id;
    private String lane1;
    private String lane2;
    private String state;
    private int zip;

    public AddressResponse(int id, String lane1, String lane2, String state, int zip) {
        this.id = id;
        this.lane1 = lane1;
        this.lane2 = lane2;
        this.state = state;
        this.zip = zip;
    }

    public AddressResponse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLane1() {
        return lane1;
    }

    public void setLane1(String lane1) {
        this.lane1 = lane1;
    }

    public String getLane2() {
        return lane2;
    }

    public void setLane2(String lane2) {
        this.lane2 = lane2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "AddressResponse{" +
                "id=" + id +
                ", lane1='" + lane1 + '\'' +
                ", lane2='" + lane2 + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }
}

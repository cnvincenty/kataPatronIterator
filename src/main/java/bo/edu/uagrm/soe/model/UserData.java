package bo.edu.uagrm.soe.model;

public class UserData {

    private String name;
    private String address;
    private double payment;

    public UserData(String name, String address, double payment) {
        this.name = name;
        this.address = address;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "UserData [name=" + name + ", address=" + address + ", payment=" + payment + "]";
    }

}

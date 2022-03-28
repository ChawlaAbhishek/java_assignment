package u4c4q2;

import java.io.Serializable;

public class Employee implements Serializable {

    private   String impId;
    private String impName;
    private Address address;
    private String email;
    private String password;

    public Employee(String impId, String impName, Address address, String email, String password) {
        this.impId = impId;
        this.impName = impName;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    public String getImpId() {
        return impId;
    }

    public void setImpId(String impId) {
        this.impId = impId;
    }

    public String getImpName() {
        return impName;
    }

    public void setImpName(String impName) {
        this.impName = impName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "impId='" + impId + '\'' +
                ", impName='" + impName + '\'' +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

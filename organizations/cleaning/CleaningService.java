package assignment2.organizations.cleaning;

import java.util.ArrayList;
import java.util.List;

import assignment2.commons.Contactable;
import assignment2.commons.Organization;

public class CleaningService extends Organization implements Contactable {
    private List<Employee> employees = new ArrayList<>();
    private String email;
    private String address;
    private String phoneNumber;

    public CleaningService(String name) {
        super.setName(name);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public boolean removeEmployee(Employee employee) {
        return employees.remove(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
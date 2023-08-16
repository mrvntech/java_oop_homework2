package homework13.model;

import java.util.ArrayList;

public abstract class Employee {
    public static int employeeCount = 0;
    protected int id;
    protected String fullName;
    protected String birthDay;
    protected String phone;
    protected String email;
    protected EmployeeType employeeType;
    protected ArrayList<Certificate> certificates = new ArrayList<Certificate>();

    public Employee(int id, String fullName, String birthDay, String phone, String email) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        Employee.employeeCount++;
    }
}

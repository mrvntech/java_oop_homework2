package homework13.model.employee;

import homework13.util.exception.BirthdayException;
import homework13.util.exception.EmailException;
import homework13.util.exception.FullNameException;
import homework13.util.exception.PhoneNumberException;
import homework13.util.validator.EmployeeInformationValidator;

import java.util.ArrayList;

public abstract class Employee {
    public static int employeeCount = 0;
    protected int id;
    protected String fullName;
    protected String birthDay;
    protected String phone;
    protected String email;
    protected EmployeeType employeeType;

    public int getId() {
        return id;
    }

    protected ArrayList<Certificate> certificates = new ArrayList<Certificate>();

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public String getFullName() {
        return fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public ArrayList<Certificate> getCertificates() {
        return certificates;
    }

    public Employee(int id, String fullName, String birthDay, String phone, String email) {
        if (!EmployeeInformationValidator.validateFullName(fullName)) throw new FullNameException();
        if (!EmployeeInformationValidator.validatePhoneNumber(phone)) throw new PhoneNumberException();
        if (!EmployeeInformationValidator.validateEmail(email)) throw new EmailException();
        if (!EmployeeInformationValidator.validateDate(birthDay)) throw new BirthdayException();
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        Employee.employeeCount++;
    }
}

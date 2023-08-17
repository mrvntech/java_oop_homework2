package homework13.model.employee;

import homework13.exception.BirthdayException;
import homework13.exception.EmailException;
import homework13.exception.FullNameException;
import homework13.exception.PhoneNumberException;
import homework13.validator.EmployeeInformationValidator;

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

    public Employee(int id, String fullName, String birthDay, String phone, String email) {
        if (!EmployeeInformationValidator.validateFullName(fullName)) throw new FullNameException();
        if (!EmployeeInformationValidator.validatePhoneNumber(phone)) throw new PhoneNumberException();
        if (!EmployeeInformationValidator.validateEmail(email)) throw new EmailException();
        if (!EmployeeInformationValidator.validateDateOfBirth(birthDay)) throw new BirthdayException();
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        Employee.employeeCount++;
    }
}

package homework14.model.student;

import homework14.exception.InvalidDateOfBirthException;
import homework14.exception.InvalidFullNameException;
import homework14.exception.InvalidPhoneNumberException;
import homework14.util.validator.StudentInputValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Student {
    protected String fullName;
    protected String dateOfBirth;
    protected boolean sex;
    protected String phoneNumber;

    protected String universityName;
    protected int gradeLevel;

    public Student(String fullName, String dateOfBirth, boolean sex, String phoneNumber, String universityName, int gradeLevel) {
        if (!StudentInputValidator.validateFullName(fullName)) throw new InvalidFullNameException();
        if (!StudentInputValidator.validateDateOfBirth(dateOfBirth)) throw new InvalidDateOfBirthException();
        if (!StudentInputValidator.validatePhoneNumber(phoneNumber)) throw new InvalidPhoneNumberException();
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", sex=" + sex +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradeLevel=" + gradeLevel +
                '}';
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isSex() {
        return sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUniversityName() {
        return universityName;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }
}

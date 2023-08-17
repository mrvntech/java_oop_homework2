package homework14.model;

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
        if (!Student.checkFullNameValid(fullName)) throw new InvalidFullNameException();
        if (!Student.checkDateOfBirthValid(dateOfBirth)) throw new InvalidDateOfBirthException();
        if (!Student.checkPhoneNumberValid(phoneNumber)) throw new InvalidPhoneNumberException();
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

    public static boolean checkFullNameValid(String fullName) {
        return fullName.length() >= 10 && fullName.length() <= 50;
    }

    public static boolean checkDateOfBirthValid(String dateOfBirth) {
        final String regex = "^[0-3]?[0-9].[0-3]?[0-9].(?:[0-9]{2})?[0-9]{2}$";
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(dateOfBirth);
        return matcher.find();
    }

    public static boolean checkPhoneNumberValid(String phoneNumber) {
        if (phoneNumber.length() != 10) return false;
        final String regex = "^[0-9]{10}$";
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.find();
    }
}

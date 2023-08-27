package homework13.util.validator;

import homework13.util.Regex;

public class EmployeeInformationValidator {
    public static boolean validateEmail(String email) {
        return Regex.EMAIL_REGEX.getPattern().matcher(email).find();
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        return Regex.PHONE_NUMBER_REGEX.getPattern().matcher(phoneNumber).find();
    }

    public static boolean validateDate(String dateOfBirth) {
        return Regex.DATE_REGEX.getPattern().matcher(dateOfBirth).find();
    }

    public static boolean validateFullName(String fullName) {
        return !fullName.equals("");
    }
}

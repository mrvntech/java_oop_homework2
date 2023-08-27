package homework14.util.validator;

import homework14.util.Regex;

public class StudentInputValidator {
    public static boolean validatePhoneNumber(String phoneNumber) {
        return Regex.PHONE_NUMBER_REGEX.getPattern().matcher(phoneNumber).find();
    }

    public static boolean validateDateOfBirth(String dateOfBirth) {
        return Regex.DATE_REGEX.getPattern().matcher(dateOfBirth).find();
    }

    public static boolean validateFullName(String fullName) {
        return fullName.length() >= 10 && fullName.length() <= 50;
    }
}

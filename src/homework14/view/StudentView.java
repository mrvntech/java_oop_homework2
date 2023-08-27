package homework14.view;

import homework14.model.action.Action;
import homework14.model.student.GoodStudent;
import homework14.model.student.NormalStudent;
import homework14.model.student.Student;
import homework14.util.validator.StudentInputValidator;

import java.util.Optional;
import java.util.Scanner;

public class StudentView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getFullName() {
        while (true) {
            System.out.print("Enter student full name: ");
            String fullName = scanner.nextLine();
            if (StudentInputValidator.validateFullName(fullName)) {
                return fullName;
            }
        }
    }

    public static String getDateOfBirth() {
        while (true) {
            System.out.print("Enter student date of birth: ");
            String dateOfBirth = scanner.nextLine();
            if (StudentInputValidator.validateDateOfBirth(dateOfBirth)) {
                return dateOfBirth;
            }
        }
    }

    public static boolean getSex() {
        while (true) {
            System.out.print("enter sex: ");
            if (scanner.hasNextBoolean()) {
                boolean sex = scanner.nextBoolean();
                scanner.nextLine();
                return sex;
            }
            scanner.nextLine();
        }
    }

    public static String getPhoneNumber() {
        while (true) {
            System.out.print("Enter phone number: ");
            String phoneNumber = scanner.nextLine();
            if (StudentInputValidator.validatePhoneNumber(phoneNumber)) return phoneNumber;
        }
    }

    public static String getUniversityName() {
        System.out.print("Enter university name: ");
        return scanner.nextLine();
    }

    public static int getGradeLevel() {
        while (true) {
            System.out.print("Enter grade level: ");
            if (scanner.hasNextInt()) {
                int gradeLevel = scanner.nextInt();
                scanner.nextLine();
                return gradeLevel;
            }
            scanner.nextLine();
        }
    }

    public static Double getGpa() {
        while (true) {
            System.out.print("Enter gpa: ");
            if (scanner.hasNextDouble()) {
                Double gradeLevel = scanner.nextDouble();
                scanner.nextLine();
                return gradeLevel;
            }
            scanner.nextLine();
        }
    }

    public static String bestRewardName() {
        System.out.print("Enter best reward name: ");
        return scanner.nextLine();
    }

    public static Double getEnglishScore() {
        while (true) {
            System.out.print("Enter english score: ");
            if (scanner.hasNextDouble()) {
                Double englishScore = scanner.nextDouble();
                scanner.nextLine();
                return englishScore;
            }
            scanner.nextLine();
        }
    }

    public static Double getEntryTestScore() {
        while (true) {
            System.out.print("Enter entry test score: ");
            if (scanner.hasNextDouble()) {
                Double entryTestScore = scanner.nextDouble();
                scanner.nextLine();
                return entryTestScore;
            }
            scanner.nextLine();
        }
    }

    public static String getBestRewardName() {
        while (true) {
            System.out.print("Enter entry test score: ");
            return scanner.nextLine();
        }
    }

    public static int getHideNumber() {
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public static Action getAction() {
        System.out.print("Enter action: ");
        int input = scanner.nextInt();
        scanner.nextLine();
        Optional<Action> action = Action.getAction(input);
        return action.orElse(Action.EXIT);
    }

    public static Student getNormalStudent() {
        String fullName = getFullName();
        String dateOfBirth = getDateOfBirth();
        boolean sex = getSex();
        String phoneNumber = getPhoneNumber();
        String universityName = getUniversityName();
        int gradeLevel = getGradeLevel();
        double englishTestScore = getEnglishScore();
        double entryTestScore = getEntryTestScore();
        return new NormalStudent(fullName, dateOfBirth, sex, phoneNumber, universityName, gradeLevel, englishTestScore, entryTestScore);
    }

    public static Student getGoodStudent() {
        String fullName = getFullName();
        String dateOfBirth = getDateOfBirth();
        boolean sex = getSex();
        String phoneNumber = getPhoneNumber();
        String universityName = getUniversityName();
        int gradeLevel = getGradeLevel();
        double gpa = getGpa();
        String bestRewardName = getBestRewardName();
        return new GoodStudent(fullName, dateOfBirth, sex, phoneNumber, universityName, gradeLevel, gpa, bestRewardName);
    }
}

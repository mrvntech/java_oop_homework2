package homework13.view;

import homework13.model.action.Action;
import homework13.model.employee.*;
import homework13.validator.EmployeeInformationValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class EmployeeManagementView {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getId() {
        int id;
        while (true) {
            System.out.print("Enter id: ");
            if (scanner.hasNextInt()) {
                id = scanner.nextInt();
                scanner.nextLine();
                break;
            }
            scanner.nextLine();
        }
        return id;
    }

    public static String getFullName() {
        while (true) {
            System.out.print("Enter full name: ");
            String fullName = scanner.nextLine();
            if (EmployeeInformationValidator.validateFullName(fullName)) {
                return fullName;
            }
        }
    }

    public static String getDateOfBirth() {
        while (true) {
            System.out.print("Enter date of birth: ");
            String dateOfBirth = scanner.nextLine();
            if (EmployeeInformationValidator.validateDateOfBirth(dateOfBirth)) {
                return dateOfBirth;
            }
        }
    }

    public static String getPhoneNumber() {
        while (true) {
            System.out.print("Enter phone number: ");
            String phoneNumber = scanner.nextLine();
            if (EmployeeInformationValidator.validatePhoneNumber(phoneNumber)) {
                return phoneNumber;
            }
        }
    }

    public static String getEmail() {
        while (true) {
            System.out.print("Enter email: ");
            String email = scanner.nextLine();
            if (EmployeeInformationValidator.validateEmail(email)) {
                return email;
            }
        }
    }

    public static Optional<EmployeeType> getEmployeeType() {
        while (true) {
            System.out.println("Enter employee type(integer): ");
            if (scanner.hasNextInt()) {
                int employeeType = scanner.nextInt();
                scanner.nextLine();
                if (EmployeeType.getEmployeeType(employeeType).isPresent()) {
                    return Optional.of(EmployeeType.getEmployeeType(employeeType).get());
                }
            }
            scanner.nextLine();
        }
    }

    public static String getMajor() {
        System.out.print("Enter major: ");
        return scanner.nextLine();
    }

    public static int getSemester() {
        System.out.print("Enter semester: ");
        int semester = scanner.nextInt();
        scanner.nextLine();
        return semester;
    }

    public static String getUniversityName() {
        System.out.print("Enter university name: ");
        return scanner.nextLine();
    }

    public static int getGraduationRank() {
        System.out.print("Enter graduation rank: ");
        int graduationRank = scanner.nextInt();
        scanner.nextLine();
        return graduationRank;
    }

    public static String getGraduationDate() {
        System.out.print("Enter graduation date: ");
        return scanner.nextLine();
    }

    public static String getEducation() {
        System.out.print("Enter education: ");
        return scanner.nextLine();
    }

    public static int getExpInYear() {
        System.out.print("Enter experience year: ");
        int experienceYarn = scanner.nextInt();
        scanner.nextLine();
        return experienceYarn;
    }

    public static String getProSkill() {
        System.out.print("Enter pro skill");
        return scanner.nextLine();
    }

    public static Optional<Employee> getEmployee() {
        int id = getId();
        String fullName = getFullName();
        String dateOfBirth = getDateOfBirth();
        String phoneNumber = getPhoneNumber();
        String email = getEmail();
        Optional<EmployeeType> employeeType = getEmployeeType();
        if (employeeType.isPresent()) {
            switch (employeeType.get()) {
                case INTERN -> {
                    String major = getMajor();
                    String universityName = getUniversityName();
                    int semester = getSemester();
                    return Optional.of(new Intern(id, fullName, dateOfBirth, phoneNumber, email, major, semester, universityName));
                }
                case FRESHER -> {
                    String graduationDate = getGraduationDate();
                    int graduationRank = getGraduationRank();
                    String education = getEducation();
                    return Optional.of(new Fresher(id, fullName, dateOfBirth, phoneNumber, email, graduationDate, graduationRank, education));
                }
                case EXPERIENCE -> {
                    int experienceYear = getExpInYear();
                    String proSkill = getProSkill();
                    return Optional.of(new Experience(id, fullName, dateOfBirth, phoneNumber, email, experienceYear, proSkill));
                }
            }
        }
        return Optional.empty();
    }

    public static Action getAction() {
        System.out.print("Enter action: ");
        int input = scanner.nextInt();
        scanner.nextLine();
        Optional<Action> action = Action.getAction(input);
        return action.orElse(Action.EXIT);
    }

    public static void printEmployees(List<Employee> employees) {
        employees.forEach(employee -> System.out.println(employee.toString()));
    }

    public static void main(String[] args) {
        System.out.println(getFullName());
    }
}

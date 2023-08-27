package homework13.view;

import homework13.controller.EmployeeController;
import homework13.model.action.Action;
import homework13.model.employee.*;
import homework13.util.dto.*;
import homework13.util.validator.EmployeeInformationValidator;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class EmployeeManagementView {
    private static final Scanner scanner = new Scanner(System.in);

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
            if (EmployeeInformationValidator.validateDate(dateOfBirth)) {
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

    public static String getSemester() {
        System.out.print("Enter semester: ");
        return scanner.nextLine();
    }

    public static String getUniversityName() {
        System.out.print("Enter university name: ");
        return scanner.nextLine();
    }

    public static int getGraduationRank() {
        while (true) {
            System.out.print("Enter graduation rank: ");
            if (scanner.hasNextInt()) {
                int graduationRank = scanner.nextInt();
                scanner.nextLine();
                return graduationRank;
            }
            scanner.nextLine();
        }
    }

    public static String getGraduationDate() {
        while (true) {
            System.out.print("Enter graduation date: ");
            String graduationDate = scanner.nextLine();
            if (EmployeeInformationValidator.validateDate(graduationDate)) {
                return graduationDate;
            }
        }
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
        System.out.print("Enter pro skill: ");
        return scanner.nextLine();
    }

    public static int getId() {
        while (true) {
            System.out.print("Enter id: ");
            if (scanner.hasNextInt()) {
                int id = scanner.nextInt();
                scanner.nextLine();
                return id;
            }
            scanner.nextLine();
        }
    }

    public static Optional<CreateEmployeeDto> getEmployee() {
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
                    String semester = getSemester();
                    return Optional.of(new CreateInternDto(fullName, dateOfBirth, phoneNumber, email, major, semester, universityName));
                }
                case FRESHER -> {
                    String graduationDate = getGraduationDate();
                    int graduationRank = getGraduationRank();
                    String education = getEducation();
                    return Optional.of(new CreateFresherDto(fullName, dateOfBirth, phoneNumber, email, graduationDate, graduationRank, education));
                }
                case EXPERIENCE -> {
                    int experienceYear = getExpInYear();
                    String proSkill = getProSkill();
                    return Optional.of(new CreateExperienceDto(fullName, dateOfBirth, phoneNumber, email, experienceYear, proSkill));
                }
            }
        }
        return Optional.empty();
    }

    public static Optional<CreateEmployeeDto> getUpdateEmployee() {
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
                    String semester = getSemester();
                    return Optional.of(new UpdateInternDto(fullName, dateOfBirth, phoneNumber, email, major, semester, universityName, id));
                }
                case FRESHER -> {
                    String graduationDate = getGraduationDate();
                    int graduationRank = getGraduationRank();
                    String education = getEducation();
                    return Optional.of(new UpdateFresherDto(fullName, dateOfBirth, phoneNumber, email, graduationDate, graduationRank, education, id));
                }
                case EXPERIENCE -> {
                    int experienceYear = getExpInYear();
                    String proSkill = getProSkill();
                    return Optional.of(new UpdateExperienceDto(fullName, dateOfBirth, phoneNumber, email, experienceYear, proSkill, id));
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
        boolean isProgramRunning = true;
        while (isProgramRunning) {
            Action action = EmployeeManagementView.getAction();
            switch (action) {
                case ADD_EMPLOYEE -> {
                    Optional<CreateEmployeeDto> createEmployeeDto = getEmployee();
                    createEmployeeDto.ifPresent(employeeDto -> {
                        System.out.println(employeeDto.toString());
                        try {
                            EmployeeController.addEmployee();
                        } catch (SQLException e) {
                            throw new RuntimeException(e);
                        }
                    });
                }
//                case GET_ALL_INTERN -> {
//                    EmployeeManagementView.printEmployees(getAllIntern());
//                }
//                case GET_ALL_FRESHER -> {
//                    EmployeeManagementView.printEmployees(getAllFresher());
//                }
//                case GET_ALL_EXPERIENCE -> {
//                    EmployeeManagementView.printEmployees(getAllExperience());
//                }
//                default -> {
//                    isProgramRunning = false;
//                }
            }
        }
    }
}

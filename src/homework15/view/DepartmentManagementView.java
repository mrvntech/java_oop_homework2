package homework15.view;

import homework15.model.action.Action;
import homework15.model.department.Department;
import homework15.model.department.InOfficeStudent;
import homework15.model.department.Student;

import java.util.Optional;
import java.util.Scanner;

public class DepartmentManagementView {
    private static final Scanner scanner = new Scanner(System.in);

    public static Department createDepartment() {
        String departmentName = getDepartmentName();
        return new Department(departmentName);
    }

    public static String getDepartmentName() {
        while (true) {
            System.out.print("Enter department name: ");
            String departmentName = scanner.nextLine();
            if (!departmentName.equals("")) return departmentName;
        }
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

    public static String getFullName() {
        while (true) {
            System.out.print("Enter full name: ");
            String fullName = scanner.nextLine();
            if (!fullName.equals("")) return fullName;
        }
    }

    public static String getDateOfBirth() {
        while (true) {
            System.out.print("Enter date of birth: ");
            String dateOfBirth = scanner.nextLine();
            if (!dateOfBirth.equals("")) return dateOfBirth;
        }
    }

    public static String getStartYear() {
        while (true) {
            System.out.print("Enter start year: ");
            String startYear = scanner.nextLine();
            if (!startYear.equals("")) return startYear;
        }
    }

    public static Double getInputScore() {
        while (true) {
            System.out.print("Enter input score: ");
            if (scanner.hasNextDouble()) {
                Double inputScore = scanner.nextDouble();
                scanner.nextLine();
                return inputScore;
            }
            scanner.nextLine();
        }
    }

    public static String getLinkedLocation() {
        while (true) {
            System.out.print("Enter linked location: ");
            String linkedLocation = scanner.nextLine();
            if (!linkedLocation.equals("")) return linkedLocation;
        }
    }

    public static Student createStudent() {
        int id = getId();
        String fullName = getFullName();
        String dateOfBirth = getDateOfBirth();
        String startYear = getStartYear();
        Double inputScore = getInputScore();
        return new Student(id, fullName, dateOfBirth, startYear, inputScore);
    }

    public static InOfficeStudent createInofficeStudent() {
        int id = getId();
        String fullName = getFullName();
        String dateOfBirth = getDateOfBirth();
        String startYear = getStartYear();
        Double inputScore = getInputScore();
        String linkedLocation = getLinkedLocation();
        return new InOfficeStudent(id, fullName, dateOfBirth, startYear, inputScore, linkedLocation);
    }

    public static String getSemesterName() {
        while (true) {
            System.out.print("Enter semester name: ");
            String semesterName = scanner.nextLine();
            if (!semesterName.equals("")) return semesterName;
        }
    }

    public static Optional<Action> getAction() {
        while (true) {
            System.out.print("Enter input action: ");
            if (scanner.hasNextInt()) {
                int inputAction = scanner.nextInt();
                scanner.nextLine();
                return Action.getAction(inputAction);
            }
            scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        Department department = createDepartment();
        System.out.println(department);
    }
}

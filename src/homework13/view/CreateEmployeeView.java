package homework13.view;

import java.util.Optional;

public abstract class CreateEmployeeView extends InputView {
    public Optional<Integer> getId() {
        System.out.print("Enter employee id(integer): ");
        try {
            int id = scanner.nextInt();
            scanner.nextLine();
            return Optional.of(id);
        } catch (Exception exception) {
            System.out.println("Wrong input");
            return Optional.empty();
        }
    }

    public Optional<String> getFullName() {
        System.out.print("Enter employee fullName(string): ");
        try {
            return Optional.of(scanner.nextLine());
        } catch (Exception exception) {
            System.out.println("Wrong input");
            return Optional.empty();
        }
    }

    public Optional<String> getBirthDay() {
        System.out.print("Enter employee birthday(String): ");
        try {
            return Optional.of(scanner.nextLine());
        } catch (Exception exception) {
            System.out.println("Wrong input");
            return Optional.empty();
        }
    }

    public Optional<String> getPhoneNumber() {
        System.out.print("Enter employee phone number(string): ");
        try {
            return Optional.of(scanner.nextLine());
        } catch (Exception exception) {
            System.out.println("Wrong input");
            return Optional.empty();
        }
    }

    public Optional<String> getEmail() {
        System.out.println("Enter employee email(string): ");
        try {
            return Optional.of(scanner.nextLine());
        } catch (Exception exception) {
            System.out.println("Wrong input");
            return Optional.empty();
        }
    }

    public Optional<Integer> getEmployeeType() {
        System.out.println("Enter employee type(integer): ");
        try {
            int employeeType = scanner.nextInt();
            scanner.nextLine();
            return Optional.of(employeeType);
        } catch (Exception exception) {
            System.out.println("Wrong input");
            return Optional.empty();
        }
    }
};


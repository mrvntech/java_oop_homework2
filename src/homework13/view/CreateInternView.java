package homework13.view;

import java.util.Optional;

public class CreateInternView extends CreateEmployeeView {
    public Optional<String> getMajor() {
        System.out.print("Enter employee major(string): ");
        try {
            return Optional.of(scanner.nextLine());
        } catch (Exception exception) {
            System.out.println("Wrong input");
            return Optional.empty();
        }
    }

    public Optional<Integer> getSemester() {
        System.out.print("Enter employee semester(integer): ");
        try {
            int semester = scanner.nextInt();
            scanner.nextLine();
            return Optional.of(semester);
        } catch (Exception exception) {
            System.out.println("Wrong input");
            return Optional.empty();
        }
    }
}

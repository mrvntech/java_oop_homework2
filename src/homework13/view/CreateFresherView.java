package homework13.view;

import java.util.Optional;

public class CreateFresherView extends CreateEmployeeView {
    public Optional<String> getGraduationDate() {
        System.out.print("Enter graduation date(string): ");
        try {
            return Optional.of(scanner.nextLine());
        } catch (Exception exception) {
            System.out.println("Wrong input");
            return Optional.empty();
        }
    }

    public Optional<Integer> getGraduationRank() {
        System.out.print("Enter graduation rank(integer): ");
        try {
            int graduationRank = scanner.nextInt();
            scanner.nextLine();
            return Optional.of(graduationRank);
        } catch (Exception exception) {
            System.out.println("Wrong input");
            return Optional.empty();
        }
    }
}

package homework13.view;

import java.util.Optional;

public class CreateExperienceView extends CreateEmployeeView {
    public Optional<Integer> getExperienceYear() {
        System.out.print("Enter experience year(integer): ");
        try {
            int experienceYear = scanner.nextInt();
            scanner.nextLine();
            return Optional.of(experienceYear);
        } catch (Exception exception) {
            System.out.println("Wrong input");
            return Optional.empty();
        }
    }

    public Optional<String> getProSkill() {
        System.out.print("Enter pro skill(string): ");
        try {
            return Optional.of(scanner.nextLine());
        } catch (Exception exception) {
            System.out.println("Wrong input");
            return Optional.empty();
        }
    }
}

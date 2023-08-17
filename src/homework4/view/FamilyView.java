package homework4.view;

import homework4.controller.PersonController;
import homework4.model.Family;
import homework4.model.Person;

import java.util.Scanner;

public class FamilyView {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getHouseNumber() {
        System.out.print("Enter house number: ");
        int houseNumber = scanner.nextInt();
        scanner.nextLine();
        return houseNumber;
    }

    public static Family createFamily() {
        System.out.println("Enter family information");
        int houseNumber = FamilyView.getHouseNumber();
        Family family = new Family(houseNumber);
        boolean isCreatePerson = true;
        Scanner scanner = new Scanner(System.in);
        while (isCreatePerson) {
            System.out.println("Enter 1 to input person information, 2 to exit");
            int action = scanner.nextInt();
            scanner.nextLine();
            if (action == 2) isCreatePerson = false;
            Person person = PersonController.createPerson();
            family.addPerson(person);
        }
        return family;
    }
}

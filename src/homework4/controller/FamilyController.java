package homework4.controller;

import homework4.model.Family;
import homework4.model.Person;
import homework4.view.FamilyView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.Scanner;

public class FamilyController {
    private final HashMap<Family, ArrayList<Person>> families = new HashMap<>();
    private final FamilyView familyView;
    private final PersonController personController;

    public FamilyController(FamilyView familyView, PersonController personController) {
        this.familyView = familyView;
        this.personController = personController;
    }

    public void createFamily() {
        System.out.println("Enter family information");
        int houseNumber = familyView.getHouseNumber();
        Family family = new Family(houseNumber);
        boolean isCreatePerson = true;
        Scanner scanner = new Scanner(System.in);
        while (isCreatePerson) {
            System.out.println("Enter 1 to input person information, 2 to exit");
            int action = scanner.nextInt();
            scanner.nextLine();
            if (action == 2) isCreatePerson = false;
            Optional<Person> person = personController.createPerson();
            person.ifPresent(family::addPerson);
        }
        families.put(family, family.getPersons());
    }
}

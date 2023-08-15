package homework4;

import homework4.controller.FamilyController;
import homework4.controller.PersonController;
import homework4.view.FamilyView;
import homework4.view.PersonView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonController personController = new PersonController(new PersonView());
        FamilyController familyController = new FamilyController(new FamilyView(), personController);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter family number: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            familyController.createFamily();
        }
    }
}

package homework4.view;

import homework4.controller.PersonController;
import homework4.model.Family;
import homework4.model.Person;

import java.util.Scanner;

public class QuarterView {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getQuarterFamiliesNumber() {
        int quarterFamiliesNumber = scanner.nextInt();
        scanner.nextLine();
        return quarterFamiliesNumber;
    }
}

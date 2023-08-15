package homework3.view;

import java.util.Scanner;

public class ChooseActionView {
    public int chooseActionView(Scanner scanner) {
        System.out.println("Enter a number to choose action type,\n" +
                "1 to create candidate,\n" +
                "2 to get all candidate information,\n" +
                "3 to search candidate information by id,\n" +
                "4 to exit");
        int action = scanner.nextInt();
        scanner.nextLine();
        return action;
    }
}

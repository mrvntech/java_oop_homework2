package homework3.view;

import homework3.model.action.ActionType;
import homework3.model.candidate.CombinationSubject;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class CandidateManagementView {
    private static final Scanner scanner = new Scanner(System.in);

    public static ActionType chooseAction() {
        while (true) {
            System.out.println("Enter a number to choose action type,\n" +
                    "1 to create candidate,\n" +
                    "2 to get all candidate information,\n" +
                    "3 to search candidate information by id,\n" +
                    "4 to exit");
            if (scanner.hasNextInt()) {
                Optional<ActionType> actionType = ActionType.getActionType(scanner.nextInt());
                scanner.nextLine();
                if (actionType.isPresent()) {
                    return actionType.get();
                }
            }
        }
    }

    public static int getId() {
        System.out.print("Enter id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        return id;
    }

    public static String getFullName() {
        System.out.print("Enter full name: ");
        return scanner.nextLine();
    }

    public static String getAddress() {
        System.out.print("Enter address: ");
        return scanner.nextLine();
    }

    public static int getPriority() {
        System.out.print("Enter priority: ");
        int priority = scanner.nextInt();
        scanner.nextLine();
        return priority;
    }

    public static CombinationSubject getCombination() {
        while (true) {
            System.out.println("Enter an integer to choose combination subject:\n" +
                    "1 to choose combination A,\n" +
                    "2 to choose combination B,\n" +
                    "3 to choose combination C, \n" +
                    "else to exit.");
            if (scanner.hasNextInt()) {
                Optional<CombinationSubject> combinationSubject = CombinationSubject.getCombinationSubject(scanner.nextInt());
                scanner.nextLine();
                if (combinationSubject.isPresent()) {
                    return combinationSubject.get();
                }
            }
        }
    }
}

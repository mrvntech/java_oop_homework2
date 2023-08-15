package homework2.view;

import homework2.controller.DocumentManagement;
import homework2.model.*;

import java.util.Optional;
import java.util.Scanner;


public class DocumentManagementView {
    public static int getDocumentType(Scanner scanner) {
        System.out.println("Please input a number to choose document type,\n" +
                "1 to create book,\n" +
                "2 to create a magazine,\n" +
                "3 to create a report");
        int documentTypeInput = scanner.nextInt();
        scanner.nextLine();
        return documentTypeInput;
    }

    public static int getActionType(Scanner scanner) {
        System.out.println("Please input a number to choose action type,\n" +
                "1 to add document,\n" +
                "2 to remove document,\n" +
                "3 to get document information,\n" +
                "4 to get documents by type,\n" +
                "5 to exit program");
        int actionType = scanner.nextInt();
        scanner.nextLine();
        return actionType;
    }

    public static String getDocumentId(Scanner scanner) {
        System.out.print("Enter document id: ");
        return scanner.nextLine();
    }
}

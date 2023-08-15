package homework2;

import homework2.controller.ActionController;
import homework2.controller.ActionType;
import homework2.controller.DocumentController;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static boolean isProgramRunning = true;

    public static void sutDownProgram() {
        isProgramRunning = false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ActionController actionController = new ActionController();
        DocumentController documentController = new DocumentController();
        while (isProgramRunning) {
            Optional<ActionType> actionType = actionController.getActionType(scanner);
            if (actionType.isPresent()) {
                ActionType action = actionType.get();
                switch (action) {
                    case EXIT -> {
                        sutDownProgram();
                    }
                    case ADD_DOCUMENT -> {
                        documentController.createDocument(scanner);
                    }
                    case REMOVE_DOCUMENT -> {
                        documentController.removeDocumentById(scanner);
                    }
                    case GET_DOCUMENTS_BY_TYPE -> {
                        documentController.getDocumentsByType(scanner);
                    }
                    case GET_DOCUMENT_INFORMATION -> {
                        documentController.getDocumentInformation(scanner);
                    }
                }
            }
        }
    }
}

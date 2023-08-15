package homework3;

import homework3.controller.ActionTypeController;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static boolean isProgramRunning = true;

    public static void shutDownProgram() {
        isProgramRunning = false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ActionTypeController actionController = new ActionTypeController();
        while (isProgramRunning) {
            Optional<ActionType> actionType = actionController.getActionType(scanner);
            if (actionType.isPresent()) {
                switch (actionType.get()) {
                    case CREATE_CANDIDATE -> {

                    }
                    case GET_CANDIDATE_BY_ID -> {

                    }
                    case GET_CANDIDATE_INFORMATION -> {

                    }
                    case EXIT -> {
                        shutDownProgram();
                    }
                }
            } else {
                System.out.println("Action is not existed");
            }
        }
    }
}

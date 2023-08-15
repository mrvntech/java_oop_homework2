package homework2.controller;

import homework2.view.DocumentManagementView;

import java.util.Optional;
import java.util.Scanner;

public class ActionController {
    public Optional<ActionType> getActionType(Scanner scanner) {
        int actionTypeInput = DocumentManagementView.getActionType(scanner);
        return ActionType.getActionType(actionTypeInput);
    }
}

package homework3.controller;

import homework3.ActionType;
import homework3.view.ChooseActionView;

import java.util.Optional;
import java.util.Scanner;

public class ActionTypeController {
    public Optional<ActionType> getActionType(Scanner scanner) {
        ChooseActionView chooseActionView = new ChooseActionView();
        int actionTypeInput = chooseActionView.chooseActionView(scanner);
        return ActionType.getActionType(actionTypeInput);
    }
}

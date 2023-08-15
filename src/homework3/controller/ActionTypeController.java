package homework3.controller;

import homework3.ActionType;
import homework3.view.ActionTypeView;
import homework3.view.InputView;

import java.util.Optional;
import java.util.Scanner;

public class ActionTypeController {
    private final ActionTypeView actionTypeView;

    public ActionTypeController(ActionTypeView actionTypeView) {
        this.actionTypeView = actionTypeView;
    }

    public Optional<ActionType> getActionType() {
        int actionTypeInput = actionTypeView.chooseActionView();
        return ActionType.getActionType(actionTypeInput);
    }
}

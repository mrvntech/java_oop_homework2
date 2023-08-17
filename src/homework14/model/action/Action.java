package homework14.model.action;

import java.util.Optional;

public enum Action {
    ADD_NORMAL_STUDENT(1),
    ADD_GOOD_STUDENT(2),

    ;
    private int value;

    Action(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Optional<Action> getAction(int value) {
        for (Action action : Action.values()) {
            if (action.value == value) return Optional.of(action);
        }
        return Optional.empty();
    }
}

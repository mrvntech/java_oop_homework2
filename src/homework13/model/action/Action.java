package homework13.model.action;

import java.util.Optional;

public enum Action {
    ADD_EMPLOYEE(1),
    GET_ALL_INTERN(2),
    GET_ALL_EXPERIENCE(3),
    GET_ALL_FRESHER(4),
    EXIT(5);
    private final int value;

    Action(int value) {
        this.value = value;
    }

    public static Optional<Action> getAction(int value) {
        for (Action action : Action.values()) {
            if (action.value == value) return Optional.of(action);
        }
        return Optional.empty();
    }
}

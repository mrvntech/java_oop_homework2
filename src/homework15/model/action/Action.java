package homework15.model.action;

import java.util.Optional;

public enum Action {
    CREATE_DEPARTMENT(0),
    ADD_STUDENT(1),
    ADD_IN_OFFICE_STUDENT(2),
    GET_SEMESTER_AVERAGE_SCORE(3),
    GET_TOTAL_STUDENT(4),
    GET_HIGHEST_INPUT_SCORE_STUDENT(5),
    ;
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

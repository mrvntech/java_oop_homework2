package homework3.model.action;

import java.util.Optional;

public enum ActionType {
    CREATE_CANDIDATE(1),
    GET_CANDIDATE_INFORMATION(2),
    GET_CANDIDATE_BY_ID(3),
    EXIT(4);
    private int value;

    ActionType(int value) {
        this.value = value;
    }

    static public Optional<ActionType> getActionType(int value) {
        for (ActionType actionType : ActionType.values()) {
            if (actionType.value == value) return Optional.of(actionType);
        }
        return Optional.empty();
    }
}

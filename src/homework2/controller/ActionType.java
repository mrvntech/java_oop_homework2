package homework2.controller;

import java.util.Optional;

public enum ActionType {
    ADD_DOCUMENT(1),
    REMOVE_DOCUMENT(2),
    GET_DOCUMENT_INFORMATION(3),
    GET_DOCUMENTS_BY_TYPE(4),
    EXIT(5);
    int value;

    ActionType(int _value) {
        this.value = _value;
    }

    public static Optional<ActionType> getActionType(int value) {
        for (ActionType actionType : ActionType.values()) {
            if (actionType.value == value) return Optional.of(actionType);
        }
        return Optional.empty();
    }
}

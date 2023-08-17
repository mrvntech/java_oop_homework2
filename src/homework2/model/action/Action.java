package homework2.model.action;

import java.util.Optional;

public enum Action {
    ADD_DOCUMENT(1),
    REMOVE_DOCUMENT(2),
    GET_DOCUMENT_INFORMATION(3),
    GET_DOCUMENTS_BY_TYPE(4),
    EXIT(5);
    final int value;

    Action(int _value) {
        this.value = _value;
    }

    public static Optional<Action> getActionType(int value) {
        for (Action action : Action.values()) {
            if (action.value == value) return Optional.of(action);
        }
        return Optional.empty();
    }
}

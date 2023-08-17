package homework12.model.action;

import java.util.Optional;

public enum Action {
    //    ADD_VEHICLE(1),
    REMOVE_VEHICLE(2),
    FIND_VEHICLE_BY_BRAND(3),
    FIND_VEHICLE_BY_COLOR(4),
    ADD_TRUCK(5),
    ADD_CAR(6),
    ADD_MOTOR(7),
    EXIT(8);
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

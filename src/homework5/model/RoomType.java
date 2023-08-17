package homework5.model;

import java.util.Optional;

public enum RoomType {
    A(500, 1),
    B(300, 2),
    C(100, 3);
    private final int cost;
    private final int value;

    public int getCost() {
        return cost;
    }

    RoomType(int cost, int value) {
        this.cost = cost;
        this.value = value;
    }

    public static Optional<RoomType> getRoomType(int value) {
        for (RoomType roomType : RoomType.values()) {
            if (roomType.value == value) return Optional.of(roomType);
        }
        return Optional.empty();
    }
}

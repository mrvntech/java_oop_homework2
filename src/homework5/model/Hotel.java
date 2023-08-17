package homework5.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private final HashMap<Integer, Room> rooms = new HashMap<>();

    public void addRoom(Room room) {
        rooms.put(room.getPerson().getId(), room);
    }

    public void removeRoom(int id) {
        rooms.remove(id);
    }

    public int getRoomPrice(int id) {
        Room room = rooms.get(id);
        return room.getNumberHideDay() * room.getRoomType().getCost();
    }
}

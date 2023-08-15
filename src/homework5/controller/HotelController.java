package homework5.controller;

import homework5.model.Person;
import homework5.model.Room;
import homework5.model.RoomType;
import homework5.view.PersonView;
import homework5.view.RoomView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class HotelController {
    private HashMap<Person, ArrayList<Room>> hideRooms = new HashMap<>();
    private PersonView personView;
    private RoomView roomView;

    public HotelController(PersonView personView, RoomView roomView) {
        this.personView = personView;
        this.roomView = roomView;
    }

    public void hideRoom() {
        int id = personView.getPersonId();
        int numberHideDay = roomView.numberHideDay();
        int roomTypeInput = roomView.getRoomType();
        Optional<RoomType> roomType = RoomType.getRoomType(roomTypeInput);
        if (roomType.isPresent()) {
            Person person = new Person(id);
            Room room = new Room(person, numberHideDay, roomType.get());
            if (hideRooms.containsKey(person)) {
                ArrayList<Room> hideRoomsPerson = hideRooms.get(person);
                hideRoomsPerson.add(room);
            } else {
                hideRooms.put(person, new ArrayList<>(List.of(room)));
            }
        } else {
            System.out.println("Room type do not existed");
        }
    }
}

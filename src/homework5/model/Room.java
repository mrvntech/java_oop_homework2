package homework5.model;

public class Room {
    private Person person;
    private int NumberHideDay;
    private RoomType roomType;

    public Room(Person person, int numberHideDay, RoomType roomType) {
        this.person = person;
        NumberHideDay = numberHideDay;
        this.roomType = roomType;
    }



}

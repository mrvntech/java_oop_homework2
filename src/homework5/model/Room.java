package homework5.model;

public class Room {
    private Person person;
    private int numberHideDay;
    private RoomType roomType;

    public Room(Person person, int numberHideDay, RoomType roomType) {
        this.person = person;
        this.numberHideDay = numberHideDay;
        this.roomType = roomType;
    }

    public int getNumberHideDay() {
        return numberHideDay;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public Person getPerson() {
        return person;
    }
}

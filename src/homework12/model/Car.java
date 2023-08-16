package homework12.model;

public class Car extends Vehicle {
    private int seats;
    private String engineType;

    public Car(int id, String brand, int createAt, Double price, String color, int seats, String engineType) {
        super(id, brand, createAt, price, color);
        this.seats = seats;
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engineType='" + engineType + '\'' +
                ", id=" + id +
                ", brand='" + brand + '\'' +
                ", createAt=" + createAt +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

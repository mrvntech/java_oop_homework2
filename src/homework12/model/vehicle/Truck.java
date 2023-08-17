package homework12.model.vehicle;

public class Truck extends Vehicle {
    private Double weight;

    public Truck(int id, String brand, String createAt, Double price, String color, Double weight) {
        super(id, brand, createAt, price, color);
        this.weight = weight;
    }
}

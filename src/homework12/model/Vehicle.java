package homework12.model;

public abstract class Vehicle {
    protected int id;
    protected String brand;
    protected int createAt;
    protected Double price;
    protected String color;

    public Vehicle(int id, String brand, int createAt, Double price, String color) {
        this.id = id;
        this.brand = brand;
        this.createAt = createAt;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int getId() {
        return id;
    }
}

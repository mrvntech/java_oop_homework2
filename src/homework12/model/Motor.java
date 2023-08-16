package homework12.model;

public class Motor extends Vehicle {
    private Double performance;

    public Motor(int id, String brand, int createAt, Double price, String color, Double performance) {
        super(id, brand, createAt, price, color);
        this.performance = performance;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "performance=" + performance +
                ", id=" + id +
                ", brand='" + brand + '\'' +
                ", createAt=" + createAt +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

package homework9.model;

public class Bill {
    private Customer customer;
    private int oldNumber;
    private int newNumber;
    private final int pricePerUnit = 5;

    public int getPrice() {
        return (newNumber - oldNumber) * pricePerUnit;
    }
}

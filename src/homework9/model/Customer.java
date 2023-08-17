package homework9.model;

public class Customer {
    private String fullName;
    private int houseNumber;
    private int number;

    public Customer(String fullName, int houseNumber, int number) {
        this.fullName = fullName;
        this.houseNumber = houseNumber;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

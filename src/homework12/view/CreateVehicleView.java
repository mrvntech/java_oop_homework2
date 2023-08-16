package homework12.view;

import java.util.Scanner;

public abstract class CreateVehicleView {
    protected final Scanner scanner = new Scanner(System.in);

    abstract public int getId();

    abstract public String getBrand();

    abstract public int getCreateAt();

    abstract public Double getPrice();

    abstract public String getColor();
}

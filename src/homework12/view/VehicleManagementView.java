package homework12.view;

import homework12.model.action.Action;
import homework12.model.vehicle.Car;
import homework12.model.vehicle.Motor;
import homework12.model.vehicle.Truck;
import homework12.model.vehicle.Vehicle;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class VehicleManagementView {
    private static final Scanner scanner = new Scanner(System.in);

    public static Action getAction() {
        System.out.print("Enter action: ");
        int input = scanner.nextInt();
        scanner.nextLine();
        Optional<Action> action = Action.getAction(input);
        return action.orElse(Action.EXIT);
    }

    public static int getId() {
        System.out.print("Enter id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        return id;
    }

    public static String getBrand() {
        System.out.print("Enter brand: ");
        return scanner.nextLine();
    }

    public static String getCreateAt() {
        System.out.print("Enter createAt: ");
        return scanner.nextLine();
    }

    public static Double getPrice() {
        System.out.print("Enter price : ");
        Double price = scanner.nextDouble();
        scanner.nextLine();
        return price;
    }

    public static String getColor() {
        System.out.print("Enter color: ");
        return scanner.nextLine();
    }

    public static int getSeatNumber() {
        System.out.print("Enter seat number: ");
        int seatNumber = scanner.nextInt();
        scanner.nextLine();
        return seatNumber;
    }

    public static String getEngineType() {
        System.out.println("Enter engine type: ");
        return scanner.nextLine();
    }

    public static Double getPerformance() {
        System.out.print("Enter performance: ");
        Double performance = scanner.nextDouble();
        scanner.nextLine();
        return performance;
    }

    public static Double getWeight() {
        System.out.print("Enter weight: ");
        Double weight = scanner.nextDouble();
        scanner.nextLine();
        return weight;
    }

    public static Truck getTruck() {
        int id = getId();
        String brand = getBrand();
        String createAt = getCreateAt();
        Double price = getPrice();
        String color = getColor();
        Double weight = getWeight();
        return new Truck(id, brand, createAt, price, color, weight);
    }

    public static Car getCar() {
        int id = getId();
        String brand = getBrand();
        String createAt = getCreateAt();
        Double price = getPrice();
        String color = getColor();
        int seatNumber = getSeatNumber();
        String engineType = getEngineType();
        return new Car(id, brand, createAt, price, color, seatNumber, engineType);
    }

    public static Motor getMotor() {
        int id = getId();
        String brand = getBrand();
        String createAt = getCreateAt();
        Double price = getPrice();
        String color = getColor();
        Double performance = getPerformance();
        return new Motor(id, brand, createAt, price, color, performance);
    }

    public static void printVehicle(List<Vehicle> vehicles) {
        vehicles.forEach(vehicle -> System.out.println(vehicle.toString()));
    }
}

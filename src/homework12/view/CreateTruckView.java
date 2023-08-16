package homework12.view;

public class CreateTruckView extends CreateVehicleView {
    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public int getCreateAt() {
        System.out.print("Enter motor createAt: ");
        int createAt = scanner.nextInt();
        scanner.nextLine();
        return createAt;
    }

    @Override
    public Double getPrice() {
        System.out.print("Enter motor price: ");
        Double price = scanner.nextDouble();
        scanner.nextLine();
        return price;
    }

    @Override
    public String getColor() {
        System.out.print("Enter motor color: ");
        return scanner.nextLine();
    }

    @Override
    public int getId() {
        System.out.print("Enter motor id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        return id;
    }
}

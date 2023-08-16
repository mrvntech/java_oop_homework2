package homework12.view;

public class CreateCarView extends CreateVehicleView {
    @Override
    public int getId() {
        System.out.print("Enter car id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        return id;
    }

    @Override
    public String getBrand() {
        System.out.print("Enter car brand: ");
        return scanner.nextLine();
    }

    @Override
    public int getCreateAt() {
        System.out.print("Enter car createAt: ");
        int createAt = scanner.nextInt();
        scanner.nextLine();
        return createAt;
    }

    @Override
    public Double getPrice() {
        System.out.print("Enter car price: ");
        Double price = scanner.nextDouble();
        scanner.nextLine();
        return price;
    }

    @Override
    public String getColor() {
        System.out.print("Enter car color: ");
        return scanner.nextLine();
    }
}

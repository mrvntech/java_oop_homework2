package homework4.view;

public class FamilyView extends InputView {
    public int getHouseNumber() {
        System.out.print("Enter house number: ");
        int houseNumber = scanner.nextInt();
        scanner.nextLine();
        return houseNumber;
    }
}

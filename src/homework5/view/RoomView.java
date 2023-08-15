package homework5.view;

public class RoomView extends InputView {
    public int getRoomType() {
        System.out.println("""
                Enter integer to choose room type:\s
                1 for room type A,
                2 for room type B,
                3 for room type C""");
        int roomType = scanner.nextInt();
        scanner.nextLine();
        return roomType;
    }

    public int numberHideDay() {
        System.out.print("Enter number hide day: ");
        int numberHideDay = scanner.nextInt();
        scanner.nextLine();
        return numberHideDay;
    }
}

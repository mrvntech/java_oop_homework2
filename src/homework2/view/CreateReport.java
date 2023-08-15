package homework2.view;

import java.util.Scanner;

public class CreateReport implements CreateDocument {
    @Override
    public String getId(Scanner scanner) {
        System.out.print("Enter report id: ");
        return scanner.nextLine();
    }

    @Override
    public String getPublisher(Scanner scanner) {
        System.out.print("Enter report publisher: ");
        return scanner.nextLine();
    }

    @Override
    public int getPublishNumber(Scanner scanner) {
        System.out.print("Enter report publish number: ");
        int publishNumber = scanner.nextInt();
        scanner.nextLine();
        return publishNumber;
    }

    public int getDate(Scanner scanner) {
        System.out.print("Enter report date: ");
        int date = scanner.nextInt();
        scanner.nextLine();
        return date;
    }
}

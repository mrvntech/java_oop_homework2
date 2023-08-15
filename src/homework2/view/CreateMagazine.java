package homework2.view;

import java.util.Scanner;

public class CreateMagazine implements CreateDocument {
    @Override
    public String getId(Scanner scanner) {
        System.out.print("Enter magazine id: ");
        return scanner.nextLine();
    }

    @Override
    public String getPublisher(Scanner scanner) {
        System.out.print("Enter magazine publisher: ");
        return scanner.nextLine();
    }

    @Override
    public int getPublishNumber(Scanner scanner) {
        System.out.print("Enter magazine publish number: ");
        int publishNumber = scanner.nextInt();
        scanner.nextLine();
        return publishNumber;
    }

    public int getNumber(Scanner scanner) {
        System.out.print("Enter magazine number: ");
        int magazineNumber = scanner.nextInt();
        scanner.nextLine();
        return magazineNumber;
    }

    public int getMonth(Scanner scanner) {
        System.out.print("Enter magazine month: ");
        int month = scanner.nextInt();
        scanner.nextLine();
        return month;
    }
}

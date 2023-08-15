package homework2.view;

import java.util.Scanner;

public class CreateBook implements CreateDocument {
    @Override
    public String getId(Scanner scanner) {
        System.out.print("Enter book id: ");
        return scanner.nextLine();
    }

    @Override
    public String getPublisher(Scanner scanner) {
        System.out.println("Enter book publisher: ");
        return scanner.nextLine();
    }

    @Override
    public int getPublishNumber(Scanner scanner) {
        System.out.println("Enter book publish number: ");
        int publishNumber = scanner.nextInt();
        scanner.nextLine();
        return publishNumber;
    }

    public String getAuthor(Scanner scanner) {
        System.out.print("Enter book author: ");
        return scanner.nextLine();
    }

    public int getPageNumber(Scanner scanner) {
        System.out.print("Enter book page number: ");
        int pageNumber = scanner.nextInt();
        scanner.nextLine();
        return pageNumber;
    }
}

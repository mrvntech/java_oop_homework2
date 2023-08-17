package homework4.view;

import java.util.Scanner;

public class PersonView {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getId() {
        System.out.print("Enter person id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        return id;
    }

    public static int getAge() {
        System.out.print("Enter person age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        return age;
    }

    public static String getFullName() {
        System.out.print("Enter person full name: ");
        return scanner.nextLine();
    }

    public static String getJob() {
        System.out.print("Enter person job: ");
        return scanner.nextLine();
    }
}

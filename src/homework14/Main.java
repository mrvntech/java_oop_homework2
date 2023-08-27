package homework14;

import homework14.controller.StudentController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Enter input");
//            if (scanner.hasNextInt()) {
//                System.out.println(scanner.nextInt());
//            }
//            if (scanner.hasNextLine()) {
//                String input = scanner.nextLine();
//                System.out.println("next line " + input);
//            }
//        }
        try {
            StudentController.run();
        } catch (Exception exception) {
            System.out.println(exception.toString());
        }
    }
}

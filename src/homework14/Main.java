package homework14;

import homework14.controller.StudentController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            StudentController.run();
        } catch (Exception exception) {
            System.out.println(exception.toString());
        }
    }
}

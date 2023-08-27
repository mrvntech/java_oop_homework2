package homework13;

import homework13.controller.EmployeeController;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            EmployeeController.run();
        } catch (Exception exception) {
            System.out.println(exception.toString());
        }
    }
}

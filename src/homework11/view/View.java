package homework11.view;

import homework11.model.ComplexNumber;

import java.util.Scanner;

public class View {
    private static final Scanner scanner = new Scanner(System.in);

    public static ComplexNumber createComplexNumber() {
        System.out.print("Enter real number: ");
        Double realNumber = scanner.nextDouble();
        scanner.nextLine();
        Double imaginaryNumber = scanner.nextDouble();
        scanner.nextLine();
        return new ComplexNumber(realNumber, imaginaryNumber);
    }

    public static void printComplexNumber(ComplexNumber complexNumber) {
        System.out.println(complexNumber.toString());
    }
}

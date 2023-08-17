package homework14.view;

import java.util.Optional;
import java.util.Scanner;

public class StudentView {
    private final Scanner scanner = new Scanner(System.in);

    public Optional<String> getFullName() {
        System.out.print("Enter student full name: ");
        return Optional.empty();
    }
}

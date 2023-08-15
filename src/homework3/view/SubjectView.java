package homework3.view;

import java.util.Scanner;

public class SubjectView {
    public int getSubjectInput(Scanner scanner) {
        System.out.print("Enter a number to choose subject,\n" +
                "1 for Math,\n" +
                "2 for physic, \n" +
                "3 for biology,\n" +
                "4 for chemistry,\n" +
                "5 for literature,\n" +
                "6 for history,\n" +
                "7 for geography,\n" +
                "else for end");
        int subjectInput = scanner.nextInt();
        scanner.nextLine();
        return subjectInput;
    }
}

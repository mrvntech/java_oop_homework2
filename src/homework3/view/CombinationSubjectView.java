package homework3.view;

import homework3.model.CombinationSubject;
import homework3.model.Subject;

import java.util.ArrayList;
import java.util.Optional;

public class CombinationSubjectView extends InputView {
    public CombinationSubjectView() {
        super();
    }

    public ArrayList<Integer> getSubject() {
        boolean isEnterSubject = true;
        ArrayList<Integer> subjectInputs = new ArrayList<>();
        while (isEnterSubject) {
            isEnterSubject = false;
            System.out.println("Enter an integer to choose combination subject:\n" +
                    "1 to choose combination A,\n" +
                    "2 to choose combination B,\n" +
                    "3 to choose combination C, \n" +
                    "else to exit.");
            int subjectInput = scanner.nextInt();
            scanner.nextLine();
            for (CombinationSubject combinationSubject : CombinationSubject.values()) {
                if (subjectInput == combinationSubject.getValue()) {
                    isEnterSubject = true;
                    subjectInputs.add(subjectInput);
                    break;
                }
            }
        }
        return subjectInputs;
    }
}

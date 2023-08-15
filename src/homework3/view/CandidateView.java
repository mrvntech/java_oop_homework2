package homework3.view;

import homework3.model.Subject;

import java.util.ArrayList;
import java.util.Scanner;

public class CandidateView extends InputView {
    public CandidateView() {
        super();
    }

    public int getId() {
        System.out.print("Enter id: ");
        System.out.print("Enter id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        return id;
    }

    public String getFullName() {
        return scanner.nextLine();
    }

    public String getAddress() {
        return scanner.nextLine();
    }

    public int getPriority() {
        System.out.print("Enter priority: ");
        int priority = scanner.nextInt();
        scanner.nextLine();
        return priority;
    }

    public ArrayList<Integer> getSubject() {
        boolean isEnterSubject = true;
        SubjectView subjectView = new SubjectView();
        ArrayList<Integer> subjectInputs = new ArrayList<>();
        while (isEnterSubject) {
            isEnterSubject = false;
            int subjectInput = subjectView.getSubjectInput(scanner);
            for (Subject subject : Subject.values()) {
                if (subjectInput == subject.getValue()) {
                    isEnterSubject = true;
                    subjectInputs.add(subjectInput);
                    break;
                }
            }
        }
        return subjectInputs;
    }
};

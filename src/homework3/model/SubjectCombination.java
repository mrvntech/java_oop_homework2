package homework3.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public enum SubjectCombination {
    A(new ArrayList<Subject>(List.of(Subject.MATH, Subject.PHYSIC, Subject.GEOGRAPHY)), 1),
    B(new ArrayList<Subject>(List.of(Subject.MATH, Subject.CHEMISTRY, Subject.BIOLOGY)), 2),
    C(new ArrayList<Subject>(List.of(Subject.LITERATURE, Subject.HISTORY, Subject.GEOGRAPHY)), 3);

    private final ArrayList<Subject> subjects;
    private final int value;

    SubjectCombination(ArrayList<Subject> subjects, int value) {
        this.subjects = subjects;
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder combinationInformation = new StringBuilder("Combination " + name() + " subject: ");
        for (Subject subject : subjects) {
            combinationInformation.append(subject.toString()).append(", ");
        }
        combinationInformation.delete(combinationInformation.length() - 2, combinationInformation.length() - 1);
        return combinationInformation.toString();
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public static void main(String[] args) {
        System.out.println(A.toString());
    }
}

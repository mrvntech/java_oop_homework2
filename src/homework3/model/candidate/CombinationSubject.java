package homework3.model.candidate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public enum CombinationSubject {
    A(new ArrayList<Subject>(List.of(Subject.MATH, Subject.PHYSIC, Subject.GEOGRAPHY)), 1),
    B(new ArrayList<Subject>(List.of(Subject.MATH, Subject.CHEMISTRY, Subject.BIOLOGY)), 2),
    C(new ArrayList<Subject>(List.of(Subject.LITERATURE, Subject.HISTORY, Subject.GEOGRAPHY)), 3);
    private final ArrayList<Subject> subjects;

    public int getValue() {
        return value;
    }

    private final int value;

    CombinationSubject(ArrayList<Subject> subjects, int value) {
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

    public static Optional<CombinationSubject> getCombinationSubject(int value) {
        for (CombinationSubject combinationSubject : CombinationSubject.values()) {
            if (combinationSubject.value == value) return Optional.of(combinationSubject);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println(C.toString());
    }
}

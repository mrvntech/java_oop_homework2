package homework3.model;

import homework3.view.CandidateView;

import java.util.*;

public class Candidate {
    private final int id;
    private final String fullName;
    private final String address;
    private final int priority;
    private final ArrayList<SubjectCombination> combinations;

    public Candidate(int id, String fullName, String address, int priority, ArrayList<SubjectCombination> combinations) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.priority = priority;
        this.combinations = combinations;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority +
                ", combinations=" + combinations.toString() +
                '}';
    }

    public Optional<Set<Subject>> getSubject() {
        Optional<Set<Subject>> subjects = Optional.of(new HashSet<>());
        for (SubjectCombination subjectCombination : combinations) {
            for (Subject subject : subjectCombination.getSubjects()) {
                subjects.get().add(subject);
            }
        }
        return subjects;
    }

    public static void main(String[] args) {
        Candidate candidate = new Candidate(1, "phucnq", "tuyen quang", 1, new ArrayList<SubjectCombination>(List.of(SubjectCombination.A, SubjectCombination.B)));
        System.out.println(candidate.toString());
    }
}

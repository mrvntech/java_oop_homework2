package homework3.model;

import java.util.*;

public class Candidate {
    private final int id;
    private final String fullName;
    private final String address;
    private final int priority;
    private final ArrayList<CombinationSubject> combinations;

    public Candidate(int id, String fullName, String address, int priority, ArrayList<CombinationSubject> combinations) {
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
    @Override
    public int hashCode() {
        return id;
    }

    public static void main(String[] args) {
        Candidate candidate = new Candidate(1, "phucnq", "tuyen quang", 1, new ArrayList<CombinationSubject>(List.of(CombinationSubject.A, CombinationSubject.B)));
        System.out.println(candidate.toString());
    }
}

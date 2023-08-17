package homework3.model.candidate;

import java.util.*;

public class Candidate {
    private final int id;
    private final String fullName;
    private final String address;
    private final int priority;
    private final CombinationSubject combination;

    public int getId() {
        return id;
    }

    public Candidate(int id, String fullName, String address, int priority, CombinationSubject combination) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.priority = priority;
        this.combination = combination;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority +
                ", combinations=" + combination.toString() +
                '}';
    }

    @Override
    public int hashCode() {
        return id;
    }
}

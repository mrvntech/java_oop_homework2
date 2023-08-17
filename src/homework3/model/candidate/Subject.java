package homework3.model.candidate;

import java.util.Optional;

public enum Subject {
    MATH(1),
    PHYSIC(2),
    BIOLOGY(3),
    CHEMISTRY(4),
    LITERATURE(5),
    HISTORY(6),
    GEOGRAPHY(7);
    private final int value;

    public int getValue() {
        return value;
    }

    Subject(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return name();
    }

    public static Optional<Subject> getSubject(int value) {
        for (Subject subject : Subject.values()) {
            if (value == subject.value) return Optional.of(subject);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println(Subject.HISTORY.toString());
    }
}

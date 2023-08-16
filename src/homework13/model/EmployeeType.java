package homework13.model;

import java.util.Optional;

public enum EmployeeType {
    EXPERIENCE(0),
    FRESHER(1),
    INTERN(2);
    private final int value;

    EmployeeType(int value) {
        this.value = value;
    }

    public static Optional<EmployeeType> getEmployeeType(int value) {
        for (EmployeeType employeeType : EmployeeType.values()) {
            if (value == employeeType.value) return Optional.of(employeeType);
        }
        return Optional.empty();
    }

    public int getValue() {
        return value;
    }
}

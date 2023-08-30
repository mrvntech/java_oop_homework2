package dependenceinjection;

import java.util.Optional;

public enum EmployeeType {
    INTERN(1),
    FRESHER(2);

    private int value;

    EmployeeType(int value) {
        this.value = value;
    }

    public static Optional<EmployeeType> getEmployeeType(int value) {
        for (EmployeeType employeeType : EmployeeType.values()) {
            if (value == employeeType.value)
                return Optional.of(employeeType);
        }
        return Optional.empty();
    }
}

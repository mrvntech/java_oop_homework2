package dependenceinjection;

import java.util.Optional;

public class EmployeeFactory {
    public Optional<Employee> createEmployee(int value) {
        Optional<EmployeeType> employeeType = EmployeeType.getEmployeeType(value);
        if (employeeType.isPresent()) {
            switch (employeeType.get()) {
                case FRESHER -> {
                    return Optional.of(new Employee(new FresherOnboardingTask()));
                }
                case INTERN -> {
                    Employee employee = new Employee(null);
                    employee.setOnboardingTask(new InternOnboardingTask());
                    return Optional.of(employee);
                }
            }
        }
        return Optional.empty();
    }
}

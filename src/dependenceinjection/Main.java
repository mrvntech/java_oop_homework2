package dependenceinjection;

public class Main {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeFactory.createEmployee(1)
                .ifPresent(employee -> System.out.println(employee.getOnboardingInformation()));
    }
}

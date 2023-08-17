package homework13.controller;

import homework13.model.action.Action;
import homework13.model.employee.Employee;
import homework13.model.employee.Experience;
import homework13.model.employee.Fresher;
import homework13.model.employee.Intern;
import homework13.view.EmployeeManagementView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeController {
    private static final HashMap<Integer, Employee> employees = new HashMap<>();

    public static void addEmployee() {
        Optional<Employee> employee = EmployeeManagementView.getEmployee();
        employee.ifPresent(value -> employees.put(value.getId(), value));
    }

    public static List<Employee> getAllFresher() {
        List<Employee> listEmployee = new ArrayList<>(employees.values());
        return listEmployee.stream().filter(employee -> employee.getClass() == Fresher.class).collect(Collectors.toList());
    }

    public static List<Employee> getAllIntern() {
        List<Employee> listEmployee = new ArrayList<>(employees.values());
        return listEmployee.stream().filter(employee -> employee.getClass() == Intern.class).collect(Collectors.toList());
    }

    public static List<Employee> getAllExperience() {
        List<Employee> listEmployee = new ArrayList<>(employees.values());
        return listEmployee.stream().filter(employee -> employee.getClass() == Experience.class).collect(Collectors.toList());
    }

    public static void run() {
        boolean isProgramRunning = true;
        while (isProgramRunning) {
            Action action = EmployeeManagementView.getAction();
            switch (action) {
                case ADD_EMPLOYEE -> {
                    addEmployee();
                }
                case GET_ALL_INTERN -> {
                    EmployeeManagementView.printEmployees(getAllIntern());
                }
                case GET_ALL_FRESHER -> {
                    EmployeeManagementView.printEmployees(getAllFresher());
                }
                case GET_ALL_EXPERIENCE -> {
                    EmployeeManagementView.printEmployees(getAllExperience());
                }
                default -> {
                    isProgramRunning = false;
                }
            }
        }
    }
}

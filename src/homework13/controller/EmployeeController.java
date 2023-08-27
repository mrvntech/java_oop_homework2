package homework13.controller;

import homework13.model.action.Action;
import homework13.model.employee.Employee;
import homework13.repository.EmployeeRepository;
import homework13.util.dto.*;
import homework13.view.EmployeeManagementView;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class EmployeeController {
    public static void addEmployee() throws SQLException {
        Optional<CreateEmployeeDto> createEmployeeDto = EmployeeManagementView.getEmployee();
        if (createEmployeeDto.isPresent()) {
            if (createEmployeeDto.get() instanceof CreateFresherDto) {
                EmployeeRepository.saveFresher((CreateFresherDto) createEmployeeDto.get());
            }
            if (createEmployeeDto.get() instanceof CreateInternDto) {
                EmployeeRepository.saveIntern((CreateInternDto) createEmployeeDto.get());
            }
            if (createEmployeeDto.get() instanceof CreateExperienceDto) {
                EmployeeRepository.saveExperience((CreateExperienceDto) createEmployeeDto.get());
            }
        }
    }

    public static List<Employee> getAllFresher() throws SQLException {
        return EmployeeRepository.getAllFresher();
    }

    public static List<Employee> getAllIntern() throws SQLException {
        return EmployeeRepository.getAllIntern();
    }

    public static List<Employee> getAllExperience() throws SQLException {
        return EmployeeRepository.getAllExperience();
    }

    public static void updateEmployee() throws SQLException {
        Optional<CreateEmployeeDto> updateEmployee = EmployeeManagementView.getUpdateEmployee();
        if (updateEmployee.isPresent()) {
            if (updateEmployee.get() instanceof CreateFresherDto) {
                EmployeeRepository.updateFresher((UpdateFresherDto) updateEmployee.get());
            }
            if (updateEmployee.get() instanceof CreateInternDto) {
                EmployeeRepository.updateIntern((UpdateInternDto) updateEmployee.get());
            }
            if (updateEmployee.get() instanceof CreateExperienceDto) {
                EmployeeRepository.updateExperience((UpdateExperienceDto) updateEmployee.get());
            }
        }
    }

    public static void run() throws SQLException {
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
                case UPDATE_EMPLOYEE -> {
                    updateEmployee();
                }
                default -> {
                    isProgramRunning = false;
                }
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        run();
    }
}

package homework15.controller;

import homework15.model.action.Action;
import homework15.model.department.Department;
import homework15.model.department.Student;
import homework15.view.DepartmentManagementView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DepartmentController {
    private static final ArrayList<Department> departments = new ArrayList<>();

    public static void addDepartment() {
        Department department = DepartmentManagementView.createDepartment();
        departments.add(department);
    }

    public static Optional<Department> getDepartment() {
        String departmentName = DepartmentManagementView.getDepartmentName();
        return departments.stream().filter(department -> department.getName().equals(departmentName)).findFirst();
    }

    public static void getDepartmentAverageScore() {
        Optional<Department> department = getDepartment();
        String semesterName = DepartmentManagementView.getSemesterName();
        department.ifPresent(value -> System.out.println(value.getSemesterAverageScore(semesterName)));
    }

    public static void getHighestInputScoreStudent() {
        Optional<Department> department = getDepartment();
        department.ifPresent(value -> System.out.println(value.getHighestInputScoreStudent()));
    }

    public static void getInOfficeStudent() {
        Optional<Department> department = getDepartment();
        String location = DepartmentManagementView.getLinkedLocation();
        if (department.isPresent()) {
            List<Student> inOfficeStudents = department.get().getInOfficeStudent(location);
            inOfficeStudents.forEach(student -> System.out.println(student.toString()));
        }
    }

    public static void tenMethod() {
        Optional<Department> department = getDepartment();
        if (department.isPresent()) {
            List<Student> students = department.get().getListStudentWith8();
            students.forEach(student -> System.out.println(student.toString()));
        }
    }

    public static void getHighestScoreStudent() {
        Optional<Department> department = getDepartment();
        String semesterName = DepartmentManagementView.getSemesterName();
        if (department.isPresent()) {
            Optional<Student> student = department.get().getHighestScoreStudent(semesterName);
            if (student.isPresent()) System.out.println(student.toString());
        }
    }

    public static void getTotalStudent() {
        Optional<Department> department = getDepartment();
        System.out.println(department.map(Department::getTotalStudent).orElse(0));
    }

    public static void run() {
        boolean isProgramRunning = true;
        while (isProgramRunning) {
            Optional<Action> action = DepartmentManagementView.getAction();
            if (action.isPresent()) {
                switch (action.get()) {
                    case CREATE_DEPARTMENT -> {
                        addDepartment();
                    }
                    case GET_TOTAL_STUDENT -> {
                        getTotalStudent();
                    }
                    case ADD_IN_OFFICE_STUDENT -> {
                        getInOfficeStudent();
                    }
                    case GET_SEMESTER_AVERAGE_SCORE -> {
                        getDepartmentAverageScore();
                    }
                    case GET_HIGHEST_INPUT_SCORE_STUDENT -> {
                        getHighestInputScoreStudent();
                    }
                    default -> {
                        isProgramRunning = false;
                    }
                }
            } else {
                isProgramRunning = false;
            }
        }
    }
}

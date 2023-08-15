package homework6.controller;

import homework6.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class StudentController {
    ArrayList<Student> students;

    public void createStudent() {

    }

    public List<Student> getStudentByAge(int age) {
        return students.stream().filter(student -> {
            return student.getAge() == age;
        }).collect(Collectors.toList());
    }

    public List<Student> getStudentByAgeAndHomeTown(int age, String homeTown) {
        return students.stream().filter(student -> {
            return student.getAge() == age && student.getHomeTown().equals(homeTown);
        }).collect(Collectors.toList());
    }
}

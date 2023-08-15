package homework7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class TeacherController {
    private HashSet<Teacher> teachers = new HashSet<>();

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(int id) {
        teachers.stream().filter(teacher -> {
            return teacher.getId() == id;
        }).forEach(teacher -> {
            teachers.remove(teacher);
        });

    }
}

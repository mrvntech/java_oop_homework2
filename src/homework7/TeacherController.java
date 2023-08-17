package homework7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class TeacherController {
    private HashMap<Integer, Teacher> teachers = new HashMap<>();

    public void addTeacher(Teacher teacher) {
        teachers.put(teacher.getId(), teacher);
    }

    public void removeTeacher(int id) {
        teachers.remove(id);
    }

}

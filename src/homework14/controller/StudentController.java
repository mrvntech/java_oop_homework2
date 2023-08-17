package homework14.controller;

import homework14.model.GoodStudent;
import homework14.model.NormalStudent;
import homework14.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StudentController {
    private final Comparator<Student> comparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            if (o1 instanceof GoodStudent && o2 instanceof GoodStudent) {
                double compareValue = ((GoodStudent) o1).getGpa() - ((GoodStudent) o2).getGpa();
                if (compareValue == 0) {
                    return o1.getFullName().hashCode() - o2.getFullName().hashCode();
                }
                return (int) compareValue;
            }
            if (o1 instanceof GoodStudent && o2 instanceof NormalStudent) return 1;
            if (o1 instanceof NormalStudent && o2 instanceof GoodStudent) return -1;
            if (o1 instanceof NormalStudent && o2 instanceof NormalStudent) {
                if (((NormalStudent) o1).getEntryTestScore().compareTo(((NormalStudent) o2).getEntryTestScore()) == 0) {
                    if (((NormalStudent) o1).getEntryTestScore().compareTo(((NormalStudent) o2).getEnglishScore()) == 0) {
                        return o1.getFullName().hashCode() - o2.getFullName().hashCode();
                    }
                    return ((NormalStudent) o1).getEnglishScore().compareTo(((NormalStudent) o2).getEnglishScore());
                }
                return ((NormalStudent) o1).getEntryTestScore().compareTo(((NormalStudent) o2).getEntryTestScore());
            }
            return 0;
        }
    };
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        students.sort(comparator);
    }

    public ArrayList<Student> getStudents() {
        Comparator<Student> comparator1 = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFullName().hashCode() - o2.getFullName().hashCode();
            }
        };
        ArrayList<Student> listStudents = new ArrayList<>();
        Collections.copy(listStudents, students);
        listStudents.sort(comparator1);
        return listStudents;
    }
}

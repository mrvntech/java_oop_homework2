package homework14.controller;

import homework14.model.student.GoodStudent;
import homework14.model.student.NormalStudent;
import homework14.model.student.Student;
import homework14.view.StudentView;
import homework14.model.action.Action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentController {
    private static final ArrayList<Student> students = new ArrayList<>();
    private static final Comparator<Student> comparator = new Comparator<Student>() {
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

    public static void addNormalStudent() {
        Student student = StudentView.getNormalStudent();
        students.add(student);
        students.sort(comparator);
    }

    public static void addGoodStudent() {
        Student student = StudentView.getGoodStudent();
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

    public static void run() {
        boolean isProgramRunning = true;
        while (isProgramRunning) {
            Action action = StudentView.getAction();
            switch (action) {
                case EXIT -> {
                    isProgramRunning = false;
                }
                case ADD_GOOD_STUDENT -> {
                    addGoodStudent();
                }
                case ADD_NORMAL_STUDENT -> {
                    addNormalStudent();
                }
                case GET_LIST_STUDENT -> {
                    students.forEach(student -> System.out.println(student.toString()));
                }
//                case GET_LIST_HIDE_STUDENT -> {
//
//                }
            }
        }

    }
}

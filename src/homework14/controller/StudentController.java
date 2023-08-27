package homework14.controller;

import homework14.model.student.GoodStudent;
import homework14.model.student.NormalStudent;
import homework14.model.student.Student;
import homework14.repository.StudentRepository;
import homework14.view.StudentView;
import homework14.model.action.Action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentController {
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

    public static void addNormalStudent() throws SQLException {
        Student student = StudentView.getNormalStudent();
        StudentRepository.insertNormalStudent((NormalStudent) student);
//        students.sort(comparator);
    }

    public static void addGoodStudent() throws SQLException {
        Student student = StudentView.getGoodStudent();
        StudentRepository.insertGoodStudent((GoodStudent) student);
//        students.sort(comparator);
    }

    public static ArrayList<Student> getStudents() throws SQLException {
        return (ArrayList<Student>) StudentRepository.getAllStudent();
    }

    public static ArrayList<Student> getHideStudents(int n) throws SQLException {
        ArrayList<Student> students = getStudents();
        return (ArrayList<Student>) students.subList(0, n);
    }

    public static void run() throws SQLException {
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
                    getStudents().forEach(student -> System.out.println(student.toString()));
                }
                case GET_LIST_HIDE_STUDENT -> {
                    int hideNumber = StudentView.getHideNumber();
                    getHideStudents(hideNumber).forEach(student -> System.out.println(student.toString()));
                }
            }
        }

    }
}

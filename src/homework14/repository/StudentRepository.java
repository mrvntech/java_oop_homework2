package homework14.repository;

import homework14.model.student.GoodStudent;
import homework14.model.student.NormalStudent;
import homework14.model.student.Student;
import homework14.repository.DataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private static final String insertStudentStatement = "insert into students(fullName, dateOfBirth, sex, phoneNumber, universityName, gradeLevel) values(?, ?, ?, ?, ?, ?)";
    private static final String insertGoodStudentStatement = "insert into good_student(student_id, gpa, bestRewardName) values(?, ?, ?)";
    private static final String insertNormalStudentStatement = "insert into normal_student(student_id, entryTestScore, englishScore) values(?, ?, ?)";

    private static final String queryGoodStudentStatement = """
            select * from good_student
            inner join students
            on good_student.student_id = students.id""";

    private static final String queryNormalStudentStatement = """
            select * from normal_student
            inner join students
            on normal_student.student_id = students.id""";

    public static void insertGoodStudent(GoodStudent goodStudent) throws SQLException {
        Connection connection = DataSource.getDataSource();
        try {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(insertStudentStatement, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, goodStudent.getFullName());
            preparedStatement.setString(2, goodStudent.getDateOfBirth());
            preparedStatement.setBoolean(3, goodStudent.isSex());
            preparedStatement.setString(4, goodStudent.getPhoneNumber());
            preparedStatement.setString(5, goodStudent.getUniversityName());
            preparedStatement.setDouble(6, goodStudent.getGradeLevel());
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                int id = resultSet.getInt(1);
                if (id == 0) {
                    connection.rollback();
                }
                PreparedStatement preparedStatement1 = connection.prepareStatement(insertGoodStudentStatement);
                preparedStatement1.setInt(1, id);
                preparedStatement1.setDouble(2, goodStudent.getGpa());
                preparedStatement1.setString(3, goodStudent.getBestRewardName());
                preparedStatement1.executeUpdate();
            }
            connection.commit();
        } catch (Exception exception) {
            System.out.println(exception.toString());
            connection.rollback();
            throw exception;
        }
    }

    public static void insertNormalStudent(NormalStudent normalStudent) throws SQLException {
        Connection connection = DataSource.getDataSource();
        try {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(insertStudentStatement, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, normalStudent.getFullName());
            preparedStatement.setString(2, normalStudent.getDateOfBirth());
            preparedStatement.setBoolean(3, normalStudent.isSex());
            preparedStatement.setString(4, normalStudent.getPhoneNumber());
            preparedStatement.setString(5, normalStudent.getUniversityName());
            preparedStatement.setDouble(6, normalStudent.getGradeLevel());
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                int id = resultSet.getInt(1);
                if (id == 0) {
                    connection.rollback();
                }
                PreparedStatement preparedStatement1 = connection.prepareStatement(insertNormalStudentStatement);
                preparedStatement1.setInt(1, id);
                preparedStatement1.setDouble(2, normalStudent.getEntryTestScore());
                preparedStatement1.setDouble(3, normalStudent.getEnglishScore());
                preparedStatement1.executeUpdate();
            }
            connection.commit();
        } catch (Exception exception) {
            System.out.println(exception.toString());
            connection.rollback();
            throw exception;
        }
    }

    public static List<Student> getAllStudent() throws SQLException {
        Connection connection = DataSource.getDataSource();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(queryGoodStudentStatement);
        ArrayList<Student> employees = new ArrayList<>();
        while (resultSet.next()) {
            double gpa = resultSet.getDouble(2);
            String bestRewardName = resultSet.getString(3);
            String fullName = resultSet.getString(5);
            String dateOfBirth = resultSet.getString(6);
            String phoneNumber = resultSet.getString(7);
            String universityName = resultSet.getString(8);
            int gradeLevel = resultSet.getInt(9);
            boolean sex = resultSet.getBoolean(10);
            Student student = new GoodStudent(fullName, dateOfBirth, sex, phoneNumber, universityName, gradeLevel, gpa, bestRewardName);
            employees.add(student);
        }
        resultSet = statement.executeQuery(queryNormalStudentStatement);
        while (resultSet.next()) {
            double entryTestScore = resultSet.getDouble(2);
            double englishScore = resultSet.getDouble(3);
            String fullName = resultSet.getString(5);
            String dateOfBirth = resultSet.getString(6);
            String phoneNumber = resultSet.getString(7);
            String universityName = resultSet.getString(8);
            int gradeLevel = resultSet.getInt(9);
            boolean sex = resultSet.getBoolean(10);
            Student student = new NormalStudent(fullName, dateOfBirth, sex, phoneNumber, universityName, gradeLevel, englishScore, entryTestScore);
            employees.add(student);
        }
        return employees;
    }
}

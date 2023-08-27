package homework13.repository;

import homework13.model.employee.Employee;
import homework13.model.employee.Experience;
import homework13.model.employee.Fresher;
import homework13.model.employee.Intern;
import homework13.util.dto.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private final static String insertEmployeeStatement = "insert into employees(fullName, birthDay, phoneNumber, email) values (?, ?, ?, ?)";
    private final static String insertFresherStatement = "insert into fresher(employee_id, graduationDate, graduationRank, education) values(?, ?, ?, ?)";
    private static final String insertExperienceStatement = "insert into experience(employee_id, expInYear, proSkill) values(?, ?, ?)";
    private static final String insertInternStatement = "insert into intern(employee_id, major, semester, universityName) values(?, ?, ?, ?)";
    private static final String updateEmployeeStatement = """
            update employees  set\s
            fullName = ?,
            birthDay = ?,
            phoneNumber = ?,
            email = ?
            where id = ?""";
    private static final String updateFresherStatement = """
            update fresher set\s
            graduationDate = ?,
            graduationRank = ?,
            education = ?
            where employee_id = ?""";

    private static final String updateInternStatement = """
            update intern set\s
            semester = ?,
            universityName = ?,
            major  = ?
            where employee_id = ?""";

    private static final String updateExperienceStatement = """
            update experience  set\s
            expInYear  = ?
            proSkill  = ?
            where employee_id = ?""";
    private static final String queryFreshersStatement = """
            select * from fresher
            inner join employees
            on fresher.employee_id = employees.id""";
    private static final String queryInternStatement = """
            select * from intern
            inner join employees
            on intern.employee_id = employees.id""";

    private static final String queryExperienceStatement = """
            select * from experience
            inner join employees
            on experience.employee_id = employees.id;""";

    public static void saveFresher(CreateFresherDto createFresherDto) throws SQLException {
        Connection connection = DataSource.getDataSource();
        try {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(insertEmployeeStatement, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, createFresherDto.fullName);
            preparedStatement.setString(2, createFresherDto.dateOfBirth);
            preparedStatement.setString(3, createFresherDto.phoneNumber);
            preparedStatement.setString(4, createFresherDto.email);
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                int id = resultSet.getInt(1);
                if (id == 0) {
                    connection.rollback();
                }
                PreparedStatement preparedStatement1 = connection.prepareStatement(insertFresherStatement);
                preparedStatement1.setInt(1, id);
                preparedStatement1.setString(2, createFresherDto.graduationDate);
                preparedStatement1.setInt(3, createFresherDto.graduationRank);
                preparedStatement1.setString(4, createFresherDto.education);
                preparedStatement1.executeUpdate();
            }
            connection.commit();
        } catch (Exception exception) {
            connection.rollback();
            throw exception;
        }
    }

    public static void saveIntern(CreateInternDto createInternDto) throws SQLException {
        Connection connection = DataSource.getDataSource();
        try {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(insertEmployeeStatement, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, createInternDto.fullName);
            preparedStatement.setString(2, createInternDto.dateOfBirth);
            preparedStatement.setString(3, createInternDto.phoneNumber);
            preparedStatement.setString(4, createInternDto.email);
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                int id = resultSet.getInt(1);
                if (id == 0) {
                    connection.rollback();
                }
                PreparedStatement preparedStatement1 = connection.prepareStatement(insertInternStatement);
                preparedStatement1.setInt(1, id);
                preparedStatement1.setString(2, createInternDto.major);
                preparedStatement1.setString(3, createInternDto.semester);
                preparedStatement1.setString(4, createInternDto.universityName);
                preparedStatement1.executeUpdate();
            }
            connection.commit();
        } catch (Exception exception) {
            connection.rollback();
            throw exception;
        }
    }

    public static void saveExperience(CreateExperienceDto createExperienceDto) throws SQLException {
        Connection connection = DataSource.getDataSource();
        try {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(insertEmployeeStatement, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, createExperienceDto.fullName);
            preparedStatement.setString(2, createExperienceDto.dateOfBirth);
            preparedStatement.setString(3, createExperienceDto.phoneNumber);
            preparedStatement.setString(4, createExperienceDto.email);
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                int id = resultSet.getInt(1);
                if (id == 0) {
                    connection.rollback();
                }
                PreparedStatement preparedStatement1 = connection.prepareStatement(insertExperienceStatement);
                preparedStatement1.setInt(1, id);
                preparedStatement1.setInt(2, createExperienceDto.expInYear);
                preparedStatement1.setString(3, createExperienceDto.proSkill);
                preparedStatement1.executeUpdate();
            }
            connection.commit();
        } catch (Exception exception) {
            connection.rollback();
            throw exception;
        }
    }

    public static List<Employee> getAllFresher() throws SQLException {
        Connection connection = DataSource.getDataSource();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(queryFreshersStatement);
        ArrayList<Employee> employees = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String graduationDate = resultSet.getString(2);
            int graduationRank = resultSet.getInt(3);
            String education = resultSet.getString(4);
            String fullName = resultSet.getString(6);
            String birthDay = resultSet.getString(7);
            String phoneNumber = resultSet.getString(8);
            String email = resultSet.getString(9);
            Employee employee = new Fresher(id, fullName, birthDay, phoneNumber, email, graduationDate, graduationRank, education);
            employees.add(employee);
        }
        return employees;
    }

    public static List<Employee> getAllIntern() throws SQLException {
        Connection connection = DataSource.getDataSource();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(queryInternStatement);
        ArrayList<Employee> employees = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String semester = resultSet.getString(2);
            String universityName = resultSet.getString(3);
            String major = resultSet.getString(4);
            String fullName = resultSet.getString(6);
            String birthDay = resultSet.getString(7);
            String phoneNumber = resultSet.getString(8);
            String email = resultSet.getString(9);
            Employee employee = new Intern(id, fullName, birthDay, phoneNumber, email, major, semester, universityName);
            employees.add(employee);
        }
        return employees;
    }

    public static List<Employee> getAllExperience() throws SQLException {
        Connection connection = DataSource.getDataSource();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(queryExperienceStatement);
        ArrayList<Employee> employees = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            int expInYear = resultSet.getInt(2);
            String proSkill = resultSet.getString(3);
            String fullName = resultSet.getString(5);
            String birthDay = resultSet.getString(6);
            String phoneNumber = resultSet.getString(7);
            String email = resultSet.getString(8);
            Employee employee = new Experience(id, fullName, birthDay, phoneNumber, email, expInYear, proSkill);
            employees.add(employee);
        }
        return employees;
    }

    public static void updateFresher(UpdateFresherDto updateFresherDto) throws SQLException {
        Connection connection = DataSource.getDataSource();
        try {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(updateEmployeeStatement);
            preparedStatement.setString(1, updateFresherDto.fullName);
            preparedStatement.setString(2, updateFresherDto.dateOfBirth);
            preparedStatement.setString(3, updateFresherDto.phoneNumber);
            preparedStatement.setString(4, updateFresherDto.email);
            preparedStatement.setInt(5, updateFresherDto.id);
            preparedStatement.executeUpdate();

            PreparedStatement preparedStatement1 = connection.prepareStatement(updateFresherStatement);
            preparedStatement1.setInt(4, updateFresherDto.id);
            preparedStatement1.setString(1, updateFresherDto.graduationDate);
            preparedStatement1.setInt(2, updateFresherDto.graduationRank);
            preparedStatement1.setString(3, updateFresherDto.education);
            preparedStatement1.executeUpdate();
            connection.commit();
        } catch (Exception exception) {
            connection.rollback();
            throw exception;
        }
    }

    public static void updateIntern(UpdateInternDto updateInternDto) throws SQLException {
        Connection connection = DataSource.getDataSource();
        try {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(updateEmployeeStatement);
            preparedStatement.setString(1, updateInternDto.fullName);
            preparedStatement.setString(2, updateInternDto.dateOfBirth);
            preparedStatement.setString(3, updateInternDto.phoneNumber);
            preparedStatement.setString(4, updateInternDto.email);
            preparedStatement.setInt(5, updateInternDto.id);
            preparedStatement.executeUpdate();

            PreparedStatement preparedStatement1 = connection.prepareStatement(updateInternStatement);
            preparedStatement1.setInt(4, updateInternDto.id);
            preparedStatement1.setString(1, updateInternDto.semester);
            preparedStatement1.setString(2, updateInternDto.universityName);
            preparedStatement1.setString(3, updateInternDto.major);
            preparedStatement1.executeUpdate();
            connection.commit();
        } catch (Exception exception) {
            connection.rollback();
            throw exception;
        }
    }

    public static void updateExperience(UpdateExperienceDto updateExperienceDto) throws SQLException {
        Connection connection = DataSource.getDataSource();
        try {
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(updateEmployeeStatement);
            preparedStatement.setString(1, updateExperienceDto.fullName);
            preparedStatement.setString(2, updateExperienceDto.dateOfBirth);
            preparedStatement.setString(3, updateExperienceDto.phoneNumber);
            preparedStatement.setString(4, updateExperienceDto.email);
            preparedStatement.setInt(5, updateExperienceDto.id);
            preparedStatement.executeUpdate();

            PreparedStatement preparedStatement1 = connection.prepareStatement(updateExperienceStatement);
            preparedStatement1.setInt(3, updateExperienceDto.id);
            preparedStatement1.setInt(1, updateExperienceDto.expInYear);
            preparedStatement1.setString(2, updateExperienceDto.proSkill);
            preparedStatement1.executeUpdate();
            connection.commit();
        } catch (Exception exception) {
            connection.rollback();
            throw exception;
        }
    }

//    public static void updateIntern(UpdateInternDto updateInternDto) throws SQLException {
//        Connection connection = DataSource.getDataSource();
//        try {
//            connection.setAutoCommit(false);
//            PreparedStatement preparedStatement = connection.prepareStatement(updateEmployeeStatement);
//            preparedStatement.setString(1, updateInternDto.fullName);
//            preparedStatement.setString(2, updateInternDto.dateOfBirth);
//            preparedStatement.setString(3, updateInternDto.phoneNumber);
//            preparedStatement.setString(4, updateInternDto.email);
//            preparedStatement.setInt(5, updateInternDto.id);
//            preparedStatement.executeUpdate();
//
//            PreparedStatement preparedStatement1 = connection.prepareStatement(updateFresherStatement);
//            preparedStatement1.setInt(5, updateInternDto.id);
//            preparedStatement1.setString(1, updateInternDto.graduationDate);
//            preparedStatement1.setInt(2, updateInternDto.graduationRank);
//            preparedStatement1.setString(3, updateInternDto.education);
//            preparedStatement1.executeUpdate();
//            connection.commit();
//        } catch (Exception exception) {
//            connection.rollback();
//            throw exception;
//        }
//    }

//    public static void updateExperience() {
//        Connection connection = DataSource.getDataSource();
//        try {
//            connection.setAutoCommit(false);
//            PreparedStatement preparedStatement = connection.prepareStatement(updateEmployeeStatement);
//            preparedStatement.setString(1, updateFresherDto.fullName);
//            preparedStatement.setString(2, updateFresherDto.dateOfBirth);
//            preparedStatement.setString(3, updateFresherDto.phoneNumber);
//            preparedStatement.setString(4, updateFresherDto.email);
//            preparedStatement.setInt(5, updateFresherDto.id);
//            preparedStatement.executeUpdate();
//
//            PreparedStatement preparedStatement1 = connection.prepareStatement(updateFresherStatement);
//            preparedStatement1.setInt(5, updateFresherDto.id);
//            preparedStatement1.setString(1, updateFresherDto.graduationDate);
//            preparedStatement1.setInt(2, updateFresherDto.graduationRank);
//            preparedStatement1.setString(3, updateFresherDto.education);
//            preparedStatement1.executeUpdate();
//            connection.commit();
//        } catch (Exception exception) {
//            connection.rollback();
//            throw exception;
//        }
//    }

    public static void main(String[] args) throws SQLException {
        getAllExperience();
    }
}

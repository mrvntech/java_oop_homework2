package homework14.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
    private static Connection connection = null;

    private DataSource() {
    }

    public static Connection getDataSource() throws SQLException {
        if (connection == null)
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/forthteen?" + "user=root&password=Godfather@2.0");
        return connection;
    }
}

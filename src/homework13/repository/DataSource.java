package homework13.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

public class DataSource {
    private static Connection connection = null;

    private DataSource() {
    }

    public static Connection getDataSource() throws SQLException {
        if (connection == null)
            return connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thirteen?" + "user=root&password=Godfather@2.0");
        return connection;
    }
}
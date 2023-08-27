package homework2.repository;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Iterator;

public class Connector {
    private static final Connection connection;

    public static Connection getConnection() {
        return connection;
    }

    static {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?" + "user=root&password=Godfather@2.0");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

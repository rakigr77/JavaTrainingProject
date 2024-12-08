package Java_TrainingProject_CSMS_Advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBHelper {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/coffee_shop";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void registerCustomer(String name) {
        String query = "INSERT INTO Customers (name) VALUES (?)";

        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, name);
            statement.executeUpdate();
            System.out.println("Customer registered successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package Java_TrainingProject_CSMS_Advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBHelper {
    private static final String URL = "jdbc:mysql://localhost:3306/coffee_shop";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static List<MenuItem> getMenuItems() {
        List<MenuItem> menuItems = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "SELECT * FROM menu_items";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                int itemID = rs.getInt("item_id");
                menuItems.add(new MenuItem(name, price, itemID));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return menuItems;
    }
}

package system.dao;

import org.springframework.stereotype.Repository;
import system.model.User;
import java.sql.*;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {

      public ArrayList user_list = new ArrayList();
    private static final String URL = "jdbc:mysql://localhost:3306/DB1";
    private static final String USER = "root";
    private static final String PASS = "15071507";

    public ArrayList getAllUsers() {
        return user_list;
    }


    public static void addNewUser(User user){

        try {
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection(URL, USER, PASS); Statement statement = connection.createStatement()) {
            statement.execute("INSERT INTO users(name, password) VALUES ('name123','password123')");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




}

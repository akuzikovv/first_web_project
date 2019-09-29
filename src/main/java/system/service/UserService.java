package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.UserDao;
import system.model.User;

import java.sql.*;
import java.util.List;

@Service
public class UserService {




    @Autowired
    private UserDao userDao;

    public List getAllUsers(){
        return userDao.getAllUsers();
    }
    public void addNewUser(User user){
         userDao.addNewUser(user);
    }



    public static void dbConnection(User user) throws SQLException {

//        try {
//            if(!connection.isClosed()) {
//                System.out.println("Соединение с БД установлено");
//                connection.close();
//                if (connection.isClosed()){
//                    System.out.println("Соединение с БД Закрыто");
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            Driver driver = new FabricMySQLDriver();
//            DriverManager.registerDriver(driver);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        try (Connection connection = DriverManager.getConnection(URL, USER, PASS); Statement statement = connection.createStatement()) {
//            statement.execute("INSERT INTO users(name, password) VALUES (,'password123')");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

    }
}

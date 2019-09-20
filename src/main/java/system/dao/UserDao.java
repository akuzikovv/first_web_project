package system.dao;

import org.springframework.stereotype.Repository;
import system.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserDao {

      public ArrayList user_list = new ArrayList();

    public List<User> getAllUsers() {
        return user_list;
    }


    public List<User> addNewUser(User user){
        user_list.add(user);
        return user_list;
    }
}

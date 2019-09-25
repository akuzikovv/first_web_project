package system.dao;

import org.springframework.stereotype.Repository;
import system.model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {

      public ArrayList user_list = new ArrayList();
    private String getAllUsers;

    public ArrayList getAllUsers() {
        return user_list;
    }


    public List<User> addNewUser(User user){
        user_list.add(user);
        return user_list;
    }



}

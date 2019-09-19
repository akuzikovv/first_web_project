package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.UserDao;
import system.model.User;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List getAllUsers(){
        return userDao.getAllUsers();
    }
    public List<User> addNewUser(User user){
        return userDao.addNewUser(user);
    }
}

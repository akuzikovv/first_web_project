package system.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;
import system.dao.UserDao;
import system.model.User;
import system.service.UserService;

import javax.xml.ws.Action;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    public  @ResponseBody
    ModelAndView getAllUsers(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("All_users",userService.getAllUsers());
        modelAndView.setViewName("users_view_page");
        return modelAndView;
    }



    @RequestMapping(value = "/validate" , method = RequestMethod.GET)
    public ModelAndView validateUser(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userFromServer", new User());
        modelAndView.setViewName("users_check_page");
        return modelAndView;

    }

    @RequestMapping(value = "/add_user" , method = RequestMethod.POST)
    public @ResponseBody  List addUser(@ModelAttribute("userFromServer") User user ){
        userService.addNewUser(user);
       return userService.getAllUsers();
    }

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public @ResponseBody String checkUser(@ModelAttribute("userFromServer") User user){
        if("admin".equals(user.getName())&& "admin".equals(user.getPassword())){
            return "valid";
        }
        else return "invalid";

    }
}

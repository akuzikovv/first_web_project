package system.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import system.dao.UserDao;
import system.model.User;
import system.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    public  @ResponseBody ArrayList getAllUsers(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("UserDao", UserDao.class);
        modelAndView.setViewName("users_view_page");
        return (ArrayList) userService.getAllUsers();
    }

    @RequestMapping("/hello")
    public String display(HttpServletRequest req,Model m)
    {
        //read the provided form data
        String name=req.getParameter("name");
        String pass=req.getParameter("pass");
        if(pass.equals("admin"))
        {
            String msg="Hello "+ name;
            //add a message to the model
            m.addAttribute("message", msg);
            return "viewpage";
        }
        else
        {
            String msg="Sorry "+ name+". You entered an incorrect password";
            m.addAttribute("message", msg);
            return "errorpage";
        }
    }





    @RequestMapping(value = "/validate" , method = RequestMethod.GET)
    public ModelAndView validateUser(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userFromServer", new User());
        modelAndView.setViewName("users_check_page");
        return modelAndView;

    }

    @RequestMapping(value = "/add_user" , method = RequestMethod.POST)
    public @ResponseBody  List addUser(@ModelAttribute("userFromServer") User user){
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

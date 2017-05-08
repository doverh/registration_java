package com.dover.authentication.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dover.authentication.dao.UserDaoImpl;
import com.dover.authentication.model.Login;
import com.dover.authentication.model.User;
 
@Controller
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String init(Model model) {
        model.addAttribute("msg", "Please Enter Your Login Details");
        return "login";
    }
 
    @RequestMapping(method = RequestMethod.POST)
    public String submit(Model model, @ModelAttribute("loginBean") Login login) {
        if (login != null && login.getUsername() != null & login.getPassword() != null) {
        	UserDaoImpl userdao = new UserDaoImpl();
        	if (userdao.validateUser(login) != null) {
            	 	model.addAttribute("msg", "welcome" + login.getUsername());
                return "success";
            } else {
                model.addAttribute("error", "Invalid Details");
                return "login";
            }
        } else {
            model.addAttribute("error", "Please enter Details");
            return "login";
        }
    }
}

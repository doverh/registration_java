package com.dover.authentication.controller;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dover.authentication.model.User;
 
	
	@Controller
	@RequestMapping(value = "/register")
	public class RegistrationController {
	
		@RequestMapping(method = RequestMethod.GET)
	    public String viewRegistration(Map<String, Object> model) {
	        User userForm = new User();    
	        model.put("userForm", userForm);    
	        return "Registration";
	    }
	     
	    @RequestMapping(method = RequestMethod.POST)
	    public String processRegistration(@ModelAttribute("userForm") User user,
	            Map<String, Object> model) {
	         
	        //Registration logic here...
	    	
	    	
	         
	        // Testing
	        System.out.println("username: " + user.getUsername());
	        System.out.println("password: " + user.getPassword());
	        System.out.println("email: " + user.getEmail());
	        System.out.println("address: " + user.getAddress());
	        System.out.println("phone: " + user.getPhone());
	         
	        return "RegistrationSuccess";
	    }
	}
		
		


package com.csye6220.esdproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.csye6220.esdproject.model.Patient;
import com.csye6220.esdproject.model.User;
import com.csye6220.esdproject.service.PatientService;
import com.csye6220.esdproject.service.UserServices;

@Controller
//@RequestMapping("/api")
public class LoginController {
	
	@Autowired
	private UserServices userServices;
	
	@RequestMapping("/loginAdmin")
	public String gotoLoginPage()
	{
		return "loginAdmin";
	}
	@RequestMapping(value = {"/" ,"/welcome"})
	public String gotoWelcomePag()
	{
		return "welcome";
	}
//	@GetMapping("/save-user")
//	public String saveUser(@RequestBody User userObj) {
//		
//		userServices.save(userObj);
//		return userObj;
//	}
		

}

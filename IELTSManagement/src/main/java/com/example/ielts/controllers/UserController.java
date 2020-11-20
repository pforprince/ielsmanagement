package com.example.ielts.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ielts.models.User;
import com.example.ielts.services.UserService;

@RestController
@RequestMapping("/u")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/save-user")
	public User saveUser(@RequestBody User user, Model model, HttpSession httpSession) {
		System.out.println("---------------------------------------");
		System.out.println(user.toString());
		return this.userService.saveUser(user);
//		if (returnedUser != null)
//			return "home";
//		return "error";
	}
	
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		return "this is a trest";
	}

}

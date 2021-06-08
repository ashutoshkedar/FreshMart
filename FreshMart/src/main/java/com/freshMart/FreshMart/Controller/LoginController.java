package com.freshMart.FreshMart.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String loginController(Model model, String error, String logout) {
		
		System.out.println("In /login GET controller");
		return "login";
	}
	
	@GetMapping("/registration")
	public String getRegistartion() {
		return "registration";
	}
	
	@GetMapping("/")
	//@ResponseBody
	public ModelAndView entry() {
		
		ModelAndView model = new ModelAndView();
		model.setViewName("EntryPage");
		return model;
		//return "redirect:/EntryPage";
	}
}

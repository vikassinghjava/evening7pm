package com.example.globalException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WelcomeController {
  
	@RequestMapping(value="/welcome")
	public String welcome(Model model) {
	  model.addAttribute("msg", "Welcome to test MVC");
	  return "welcome";
  }
}

package com.boraji.tutorial.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

   @RequestMapping("/")
   public String index() {
      return "index";
   }

   @GetMapping("/hello")
   public String sayHello(Model model) {
	  String name=null;
	   name.length();
      model.addAttribute("name", "Welcome");
      return "hello";
   }
   
  /* @ExceptionHandler(value=NullPointerException.class)
   public String handleNullpointerException(Model model) {
	   model.addAttribute("msg", "something went wrong please atry after some time!!");
	   return "error";
   }*/
   
   
}

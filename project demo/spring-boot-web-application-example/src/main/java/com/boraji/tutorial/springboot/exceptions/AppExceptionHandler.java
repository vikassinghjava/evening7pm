package com.boraji.tutorial.springboot.exceptions;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullPOinterException(Model model)
			{
			model.addAttribute("msg", "GEXH: something went wrong please try after some time!!!");
			return "error";
			}
	
	@ExceptionHandler(value=NoBookFoundException.class)
	public String noBookFoundException(Model model)
			{
			model.addAttribute("msg", "GEXH: something went wrong please try after some time!!!");
			return "customError";
			}
}

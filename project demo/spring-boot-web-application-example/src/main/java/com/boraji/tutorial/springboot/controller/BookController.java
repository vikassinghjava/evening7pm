package com.boraji.tutorial.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.boraji.tutorial.springboot.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping(value="/findPriceByID")
 public String getfindPriceByID(@RequestParam("bookid") String bookid, Model model) {
	  Double findPriceById = bookService.findPriceById(bookid);
	  model.addAttribute("price","book price: "+findPriceById);
	 return "display";
 }
}

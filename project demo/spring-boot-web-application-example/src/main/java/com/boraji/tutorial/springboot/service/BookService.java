package com.boraji.tutorial.springboot.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public interface BookService {
	
 public Double findPriceById(String bookID);
 
}

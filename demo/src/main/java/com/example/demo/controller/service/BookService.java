package com.example.demo.controller.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.controller.entity.Book;

@Service
public class BookService {
	
			public boolean saveBook(Book book) {
				return true;
			}
}

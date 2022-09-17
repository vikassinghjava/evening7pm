package com.boraji.tutorial.springboot.service;

import org.springframework.stereotype.Service;

import com.boraji.tutorial.springboot.exceptions.NoBookFoundException;
@Service
public class BookServiceImpl implements BookService {

	@Override
	public Double findPriceById(String bookID) {
			if(bookID.equals("B101")) {
				return 200.00;
			}else
			{
				throw new NoBookFoundException("Book not found !!");
			}
	}

}

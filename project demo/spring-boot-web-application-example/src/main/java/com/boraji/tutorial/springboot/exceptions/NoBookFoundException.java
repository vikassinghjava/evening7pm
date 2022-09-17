package com.boraji.tutorial.springboot.exceptions;

public class NoBookFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2167670718460496992L;

	public NoBookFoundException(String msg) {
		super(msg);
	}
}

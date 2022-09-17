package com.example.demo.controller;

import org.springframework.http.HttpStatus;

public class TestHttpStatusCode {
	public static void main(String[] args) {
			//System.out.println(HttpStatus.OK);
		for (HttpStatus status : HttpStatus.values()) {
			System.out.println(status);
		}
	}
}

package com.example.demo.controller.entity;

public class Employee {
	private int id;
	private String name;
	private String job;
	public Employee() {
		// TODO Auto-generated constructor stub
	}	
	
	public Employee(int id, String name, String job) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}

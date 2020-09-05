package com.learn.springboot2jpahibernate.model;

public class StudentNotFoundException extends RuntimeException {

	public StudentNotFoundException(String exception) {
		super(exception);
	}
}

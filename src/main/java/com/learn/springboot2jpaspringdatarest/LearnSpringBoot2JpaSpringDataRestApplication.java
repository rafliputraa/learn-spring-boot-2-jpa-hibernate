package com.learn.springboot2jpaspringdatarest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learn.springboot2jpaspringdatarest.rest.StudentDataRestRepository;

@SpringBootApplication
public class LearnSpringBoot2JpaSpringDataRestApplication {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentDataRestRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBoot2JpaSpringDataRestApplication.class, args);
	}

}

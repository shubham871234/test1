package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	
	Logger log=LoggerFactory.getLogger(DemoApplication.class);
	@PostConstruct
	public void intt() {
log.info("Applicatuon Started !!!! ");
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	}

}

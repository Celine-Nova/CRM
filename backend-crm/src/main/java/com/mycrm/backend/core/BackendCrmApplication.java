package com.mycrm.backend.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class BackendCrmApplication {

	public static void main(String[] args) {
		System.out.println("HelloWorld");
		SpringApplication.run(BackendCrmApplication.class, args);
	}

}

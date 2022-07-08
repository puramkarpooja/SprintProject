package com.mts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UniversityCourseAdmissionApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityCourseAdmissionApplication.class, args);
		System.out.println("Connected to Database");
	}

}

package com.questions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "/*")
public class QuestionsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionsServiceApplication.class, args);
	}

}

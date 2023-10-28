package com.thymeleaf.getchstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GetchstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetchstoreApplication.class, args);
	}

	// @RestController
	// public class Start {
	// @GetMapping("/hello")
	// public String HelloWorld() {
	// return "Hello World";
	// }
	// }
}

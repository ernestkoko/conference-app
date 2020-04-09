package com.pluralsight.conference;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ConferenceApplication extends SpringBootServletInitializer {
	//SpringBootServletInitializer tells the app to create a dispatcher servlet and start serving u things

	public static void main(String[] args) {
		SpringApplication.run(ConferenceApplication.class, args);
	}

}

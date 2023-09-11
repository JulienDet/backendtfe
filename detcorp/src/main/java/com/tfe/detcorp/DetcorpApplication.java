package com.tfe.detcorp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
@EnableAutoConfiguration
public class DetcorpApplication {



	private static final Logger log = LoggerFactory.getLogger(DetcorpApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DetcorpApplication.class, args);
	}
}




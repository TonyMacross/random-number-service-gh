package com.globant.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class RandomNumberServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomNumberServiceApplication.class, args);
	}

}

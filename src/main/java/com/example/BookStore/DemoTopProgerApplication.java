package com.example.BookStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class })
public class DemoTopProgerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoTopProgerApplication.class, args);
	}

}

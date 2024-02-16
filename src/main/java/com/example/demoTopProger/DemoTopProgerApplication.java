package com.example.demoTopProger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DemoTopProgerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoTopProgerApplication.class, args);
	}

}

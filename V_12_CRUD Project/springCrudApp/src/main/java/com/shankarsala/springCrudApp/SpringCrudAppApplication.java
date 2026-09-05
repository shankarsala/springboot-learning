package com.shankarsala.springCrudApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class SpringCrudAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudAppApplication.class, args);
		System.out.println("CRUD APP Started.........");
	}

}

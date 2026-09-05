package com.tatastrive.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);

/*		HelloController controller = new HelloController();
		String S = controller.hello();
		String B = controller.bye();

		System.out.println(S);
		System.out.println(B);*/
	}

}

package com.greenfoxacademy;

import com.greenfoxacademy.model.HelloWorld;
import com.greenfoxacademy.config.HelloWorldConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				HelloWorldConfig.class);

		HelloWorld helloWorld = context.getBean(HelloWorld.class);

		helloWorld.setMessage("Hello World! :) ");

		helloWorld.getMessage();

	}
}

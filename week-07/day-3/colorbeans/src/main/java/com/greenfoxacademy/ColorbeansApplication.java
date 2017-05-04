package com.greenfoxacademy;

import com.greenfoxacademy.config.ColorConfig;
import com.greenfoxacademy.model.Green;
import com.greenfoxacademy.model.MyColor;
import com.greenfoxacademy.model.Red;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ColorbeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColorbeansApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ColorConfig.class);

		MyColor color  = context.getBean(Green.class);
		color.printColor();

		MyColor color2  = context.getBean(Red.class);
		color2.printColor();

	}
}

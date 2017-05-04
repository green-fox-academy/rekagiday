package com.greenfoxacademy.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by User on 2017. 05. 04..
 */

@Configuration
public class HelloWorldConfig {

  @Bean
  public HelloWorld helloWorld(){
    return new HelloWorld();
  }
}

package com.greenfoxacademy.config;

import com.greenfoxacademy.model.Green;
import com.greenfoxacademy.model.MyColor;
import com.greenfoxacademy.model.Red;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by User on 2017. 05. 04..
 */

@Configuration
public class ColorConfig {

  @Bean
  @Primary
  public MyColor getRed() {
    return new Red();
  }

  @Bean
  public MyColor getGreen() {
    return new Green();
  }
}

package com.greenfoxacademy.config;

import com.greenfoxacademy.messageservice.MessageProceeder;
import com.greenfoxacademy.model.EmailService;
import com.greenfoxacademy.model.MessageService;
import com.greenfoxacademy.model.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by User on 2017. 05. 04..
 */

@Configuration
public class MessageConfiguration {

  @Bean
  @Primary
  public MessageService getEmailService() {
    return new EmailService();
  }

  @Bean
  public MessageService getTwitterService() {
    return new TwitterService();
  }
}

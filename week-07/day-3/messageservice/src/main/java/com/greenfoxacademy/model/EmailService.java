package com.greenfoxacademy.model;

/**
 * Created by User on 2017. 05. 04..
 */
public class EmailService implements MessageService {

  @Override
  public void sendMessage(String message, String address) {
    System.out.println("Email sent to " + address);
    System.out.println("Message: " + message);
  }
}

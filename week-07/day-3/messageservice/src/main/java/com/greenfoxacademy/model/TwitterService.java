package com.greenfoxacademy.model;

/**
 * Created by User on 2017. 05. 04..
 */
public class TwitterService implements MessageService {

  @Override
  public void sendMessage(String message, String address) {
    System.out.println("Tweet sent to: " + address);
    System.out.println("Message: " + message);
  }
}

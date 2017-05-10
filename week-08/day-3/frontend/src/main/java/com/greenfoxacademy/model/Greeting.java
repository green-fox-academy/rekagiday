package com.greenfoxacademy.model;

/**
 * Created by User on 2017. 05. 10..
 */
public class Greeting {

  String welcomeMessage;

  public Greeting(String name, String title) {
    this.welcomeMessage = "Oh hi there" + name + ", my dear " + title + "!";
  }
}

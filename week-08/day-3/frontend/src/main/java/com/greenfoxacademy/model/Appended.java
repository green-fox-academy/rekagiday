package com.greenfoxacademy.model;

/**
 * Created by User on 2017. 05. 10..
 */
public class Appended {

  private String appended;

  public Appended(String input) {
    this.appended = input + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}

package com.greenfoxacademy.model;

/**
 * Created by User on 2017. 05. 10..
 */
public class Displayer {

  int received;
  int result;

  public Displayer(int received) {
    this.received = received;
    this.result = received * 2;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}

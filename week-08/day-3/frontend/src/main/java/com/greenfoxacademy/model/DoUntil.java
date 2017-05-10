package com.greenfoxacademy.model;


public class DoUntil {

  int until;
  private int result;

  public DoUntil() {
  }

  public int getResult() {
    return result;
  }

  public void setUntil(int until) {
    this.until = until;
  }

  public void sumUntil() {
    int sum = 0;
    for (int i = 1; i <= until; i++) {
      sum += i;
    }
    result = sum;
  }

  public void factUntil() {
    int fact = 1;
    for (int i = 1; i <= until; i++) {
      fact = fact * i;
    }
    result = fact;
  }


}

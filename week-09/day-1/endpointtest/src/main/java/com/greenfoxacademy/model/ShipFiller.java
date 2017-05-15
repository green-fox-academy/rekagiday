package com.greenfoxacademy.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShipFiller {

  @Autowired
  Rocket rocket;

  String received;
  int amount;
  String shipstatus;
  boolean ready;

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public String getShipstatus() {
    return rocket.getShipstatus();
  }

  public void setShipstatus(String shipstatus) {
    this.shipstatus = rocket.getShipstatus();
  }

  public boolean isReady() {
    return rocket.isReady();
  }

  public void setReady(boolean ready) {
    this.ready = rocket.isReady();
  }
}

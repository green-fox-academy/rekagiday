package com.greenfoxacademy.model;

import org.springframework.stereotype.Component;

@Component
public class Yondu {

  double distance;
  double time;
  double speed;

  public double getDistance() {
    return distance;
  }

  public void setDistance(double distance) {
    this.distance = distance;
  }

  public double getTime() {
    return time;
  }

  public void setTime(double time) {
    this.time = time;
  }

  public void setSpeed() {
    this.speed = distance/time;
  }

  public double getSpeed() {
    return speed;
  }
}

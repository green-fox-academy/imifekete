package com.greenfox.model;

public class Arrow {
  double distance;
  double time;
  double speed;

  public Arrow(double distance, double time) {
    this.distance = distance;
    this.time = time;
    speed = distance / time;
  }

  public double getDistance() {
    return distance;
  }

  public double getTime() {
    return time;
  }

  public double getSpeed() {
    return speed;
  }
}

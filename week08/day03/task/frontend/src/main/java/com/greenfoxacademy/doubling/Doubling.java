package com.greenfoxacademy.doubling;

public class Doubling {
  private int received;
  private int result;

  public Doubling(int received) {
    this.received = received;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return received * 2;
  }

  public void setResult(int result) {
    this.result = result;
  }
}

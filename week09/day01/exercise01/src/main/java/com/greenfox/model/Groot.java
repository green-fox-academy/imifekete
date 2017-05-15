package com.greenfox.model;

public class Groot {
  String received;
  String translated;

  public Groot(String receivedMessage) {
    received = receivedMessage;
    translated = "I am groot!";
  }

  public Groot() {

  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}



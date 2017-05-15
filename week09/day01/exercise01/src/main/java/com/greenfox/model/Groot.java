package com.greenfox.model;

public class Groot {
  private String received;
  private String translated;

  public Groot(String translated) {
    this.translated = "I am Groot!";
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



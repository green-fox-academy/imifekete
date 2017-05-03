package com.greenfoxacademy.model;

/**
 * Created by Fekete Imre on 2017.05.03..
 */

public class BankAccount {
  private String name;
  private int balance;
  private String animalType;

  public BankAccount (String name, int balance, String animalType ){
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }
}

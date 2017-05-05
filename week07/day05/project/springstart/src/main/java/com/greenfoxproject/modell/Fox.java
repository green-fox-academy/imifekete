package com.greenfoxproject.modell;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fekete Imre on 2017.05.05..
 */
@Component
public class Fox {
  private String name;
  private String drink;
  private String food;
  private List<String> listOfTricks = new ArrayList<>();

  public Fox() {
    name = "Mr Fox";
    food = "salad";
    drink = "water";
  }

  public int numberOfTricks (){
    return listOfTricks.size();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }
}

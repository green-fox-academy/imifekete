package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Fekete Imre on 2017.05.03..
 */
@Controller
public class Exercise01 {

  @RequestMapping(value = "/")
  public String bankAccount(Model model) {
    BankAccount account1 = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("name", account1.getName());
    model.addAttribute("balance", account1.getBalance());
    model.addAttribute("animalType", account1.getAnimalType());
    return "index";
  }
}

package com.greenfoxacademy.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Fekete Imre on 2017.05.02..
 */
@RestController
public class HelloRESTController {

  @RequestMapping
  public Greeting greeting (){
    return new Greeting(1, "Hello, World!");
  }
}

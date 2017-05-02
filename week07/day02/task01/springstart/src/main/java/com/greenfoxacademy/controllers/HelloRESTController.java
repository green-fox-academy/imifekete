package com.greenfoxacademy.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Fekete Imre on 2017.05.02..
 */
@RestController
public class HelloRESTController {

  @RequestMapping
  public Greeting greeting (@RequestParam("name") String name){
    return new Greeting(1, name);
  }
}

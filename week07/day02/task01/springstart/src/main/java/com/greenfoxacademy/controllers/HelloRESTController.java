package com.greenfoxacademy.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Fekete Imre on 2017.05.02..
 */
@RestController
public class HelloRESTController {
AtomicLong counter = new AtomicLong(1);

  @RequestMapping
  public Greeting greeting (@RequestParam("name") String name){
    return new Greeting(counter.getAndIncrement(), "Hello, " + name);
  }
}

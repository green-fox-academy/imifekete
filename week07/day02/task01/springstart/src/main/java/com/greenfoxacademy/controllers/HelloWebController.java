package com.greenfoxacademy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Fekete Imre on 2017.05.02..
 */
@Controller
public class HelloWebController {
  AtomicLong counter = new AtomicLong(1);
  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam("name") String name) {
    model.addAttribute("name", name);
    model.addAttribute("counter", counter.getAndIncrement());
    return "greeting";
  }
}

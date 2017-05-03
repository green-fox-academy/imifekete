package com.greenfoxacademy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Fekete Imre on 2017.05.03..
 */
@Controller
public class Exercise04 {
  @RequestMapping(value = "/4")
  public String exercise4(Model model) {
    String s = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("string", s);
    return "index4";
  }
}

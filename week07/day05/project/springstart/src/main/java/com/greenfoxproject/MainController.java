package com.greenfoxproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Fekete Imre on 2017.05.05..
 */
@Controller
public class MainController {

  @RequestMapping ("/")
    public String index(){
    return "index";
  }
}

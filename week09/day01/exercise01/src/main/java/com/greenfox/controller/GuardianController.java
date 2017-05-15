package com.greenfox.controller;

import com.greenfox.model.ErrorMessage;
import com.greenfox.model.Groot;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @RequestMapping("/groot")
  public Groot getGroot(@RequestParam("message") String message){
    Groot groot = new Groot();
    groot.setReceived(message);
    return groot;
  }

  @ExceptionHandler(MissingPathVariableException.class)
    public ErrorMessage missingPathVariableException(){
      ErrorMessage m = new ErrorMessage();
      return m;
  }
}

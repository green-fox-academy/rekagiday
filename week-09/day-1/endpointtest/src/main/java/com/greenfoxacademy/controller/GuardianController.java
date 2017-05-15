package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.Groot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class GuardianController {

  @Autowired
  Groot groot;

  @GetMapping (value = "/groot")
  public Groot groot(@RequestParam (value = "message") String message) {
    return groot;
  }
}

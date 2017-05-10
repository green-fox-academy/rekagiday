package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.Displayer;
import com.greenfoxacademy.model.Greeting;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public String handleMissingError(MissingServletRequestParameterException e) {
    return "Missing parameter: " + e.getParameterName();
  }

  @GetMapping("/doubling")
  public Displayer doubling(@RequestParam(value = "input", required = true) int input) {
    return new Displayer(input);
  }

  @GetMapping("/greeter")
  public Greeting greeter(@RequestParam (value = "name", required = true) String name, @RequestParam ( value = "title", required = true) String title) {
    return new Greeting(name, title);
  }
}


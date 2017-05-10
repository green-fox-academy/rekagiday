package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.Appended;
import com.greenfoxacademy.model.Displayer;
import com.greenfoxacademy.model.DoUntil;
import com.greenfoxacademy.model.Greeter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public String handleMissingError(MissingServletRequestParameterException e) {
    return "Missing parameter: " + e.getParameterName();
  }

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public String handleMissingError(HttpMessageNotReadableException ex) {
    return "error: Please provide a number!";
  }

  @GetMapping("/doubling")
  public Displayer doubling(@RequestParam(value = "input", required = true) int input) {
    return new Displayer(input);
  }

  @RequestMapping("/greeter")
  public Greeter greeter(@RequestParam(value = "name") String name,
      @RequestParam(value = "title") String title) {
    return new Greeter(name, title);
  }

  @RequestMapping("/appenda/{appendable}")
  public Appended appenda(@PathVariable(value = "appendable", required = true) String input) {
    return new Appended(input);
  }

  @RequestMapping("/dountil/{what}")
  public DoUntil sumUntil(@RequestBody DoUntil doUntil,
      @PathVariable(value = "what", required = true) String what) {
    if (what.equals("sum")) {
      doUntil.sumUntil();
    } else if (what.equals("factor")) {
      doUntil.factUntil();
    }
    return doUntil;
  }
}


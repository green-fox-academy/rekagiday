package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by User on 2017. 05. 02..
 */

@RestController

public class HelloRESTController {

  @RequestMapping(value="/greeting")
  @ResponseBody

  public Greeting greeting(@RequestParam("name") String name) {

    Greeting greeting = new Greeting(1, "Hello, " + name + "!");

    return greeting;

  }
}

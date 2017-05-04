package com.greenfoxacademy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by User on 2017. 05. 04..
 */
@Controller
public class MainController {

  @RequestMapping(value = "/")
  public String home() {
    return "index";
  }
}

package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by User on 2017. 05. 04..
 */
@Controller
public class MainController {

  @Autowired
  Fox fox;

  ModelAndView model = new ModelAndView();

  @RequestMapping(value = "/")
  public String home() {
    model.setViewName("home");
    model.addObject(fox);
    return "index";
  }
}

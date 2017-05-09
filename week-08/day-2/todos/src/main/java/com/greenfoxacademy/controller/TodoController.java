package com.greenfoxacademy.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController implements CommandLineRunner {


  @RequestMapping (value = {"/list", "/"})
  public String list(Model model) {
    return "This is my first todo";
  }

  @Override
  public void run(String... args) throws Exception {

  }
}


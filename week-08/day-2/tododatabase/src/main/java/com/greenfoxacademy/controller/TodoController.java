package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.Todo;
import com.greenfoxacademy.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  private Repository repository;

  @RequestMapping(value = {"/list", "/"})
  public String list(@RequestParam(value = "isActive", required = false) boolean isActive,
      Model model) {
    if (isActive) {
      model.addAttribute("todos", repository.findByIsDoneFalse());
    } else {
      model.addAttribute("todos", repository.findAll());
    }
    return "/todolist";
  }

  @RequestMapping(value = "/add")
  public String add() {
    return "/add";
  }

  @RequestMapping(value = "/addtodo")
  public String addtodo(String title) {
    repository.save(new Todo(title));
    return "redirect:/todo/list";
  }
}


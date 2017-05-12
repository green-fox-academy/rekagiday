package com.greenfoxacademy.reka.reddit.controller;

import com.greenfoxacademy.reka.reddit.model.Post;
import com.greenfoxacademy.reka.reddit.repository.PostRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {


  @Autowired
  PostRepository repository;

  List<Post> posts;

  @RequestMapping(value = "/posts", method = RequestMethod.GET)
  public List<Post> listPosts(Model model) {
    model.addAttribute(repository.findAll());
  return posts;
  }
}

package com.greenfoxacademy.reka.reddit.controller;

import com.greenfoxacademy.reka.reddit.model.Post;
import com.greenfoxacademy.reka.reddit.model.PostList;
import com.greenfoxacademy.reka.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

  @Autowired
  PostRepository repository;
  @Autowired
  PostList posts;


  @RequestMapping(value = "/posts", method = RequestMethod.GET)
  public PostList listPosts() {
    posts.addAll();
    return posts;
  }

  @RequestMapping(value = "/posts", method = RequestMethod.POST)
  public Post addPost(@RequestBody Post post) {
    return repository.save(post);
  }


  @RequestMapping(value = "/posts/{id}/downvote", method = RequestMethod.PUT)
  public void downPost(@PathVariable(value = "id") long id) {
    Post post = repository.findOne(id);
    post.downVote();
    repository.save(post);
  }

  @RequestMapping(value = "/posts/{id}/upvote", method = RequestMethod.PUT)
  public void upPost(@PathVariable(value = "id") long id) {
    Post post = repository.findOne(id);
    post.upVote();
    repository.save(post);
  }


}


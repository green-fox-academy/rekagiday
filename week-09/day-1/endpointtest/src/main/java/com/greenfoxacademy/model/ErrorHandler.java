package com.greenfoxacademy.model;

import com.greenfoxacademy.service.GrootService;
import org.springframework.stereotype.Component;

@Component
public class ErrorHandler implements GrootService{

  private String error = "I am Groot!";

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}


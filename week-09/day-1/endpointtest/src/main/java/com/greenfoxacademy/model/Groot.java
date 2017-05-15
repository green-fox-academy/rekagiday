package com.greenfoxacademy.model;

import com.greenfoxacademy.service.GrootService;
import org.springframework.stereotype.Component;

@Component
public class Groot implements GrootService {

    String received;
    String translated = "I am Groot!";


  public String getReceived() {
      return received;
    }

    public void setReceived(String received) {
      this.received = received;
    }

    public String getTranslated() {
      return translated;
    }
  }

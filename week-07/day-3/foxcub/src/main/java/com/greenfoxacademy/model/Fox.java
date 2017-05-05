package com.greenfoxacademy.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by User on 2017. 05. 04..
 */
@Getter
@Setter
public class Fox {

  String name;
  List<String> tricks;
  String food;
  String drink;

  public Fox() {
    this.name = "Blueberry";
    this.drink = "water";
    this.food = "salad";
    this.tricks = new ArrayList<>();
  }

  public void addTrick(String trick) {
    tricks.add(trick);
  }
}


package com.greenfoxacademy.springday2.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BankAccount {

  String name;
  double balance;
  String animalType;
  boolean king;
  boolean good;

  public double add() {
    return balance + 10;
  }


}


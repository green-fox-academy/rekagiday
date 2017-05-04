package com.greenfoxacademy.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by User on 2017. 05. 04..
 */
@Component
@Getter
@Setter
public class Fox {

  String name;
  List<Trick> tricks;
  String currentFood;
  String currentDrink;
}


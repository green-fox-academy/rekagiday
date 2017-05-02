package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by User on 2017. 05. 02..
 */

@RestController
public class HelloRESTController {

  @RequestMapping
  public String greeting() {

  }

}

package com.greenfoxacademy.springday2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UnescapedTextTestController {

  @RequestMapping(value = "/exercise4")
  public String showString(Model model) {
    String text = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", text);
    return "unescaped";
  }

}

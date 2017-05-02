package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by User on 2017. 05. 02..
 */
@Controller
public class HelloAllTheWorldWebController {


  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj",
      "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló",
      "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry",
      "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem",
      "Sawubona"};


  @RequestMapping(value = "/web/helloall")
  public String greeting(@RequestParam(value = "name", defaultValue = "World") String name,
      Model model) {
    model.addAttribute("name", name);
    model.addAttribute("hellos", hellos);
    model.addAttribute("color", randomColors());
    model.addAttribute("fontSize", randomSize());
    return "helloall";
  }

  public String[] randomColors() {
    String[] color = new String[hellos.length];

    for (int i = 0; i < hellos.length; i++) {
      int r = (int) (Math.random() * 256);
      int g = (int) (Math.random() * 256);
      int b = (int) (Math.random() * 256);
      String rgb = "rgb(" + r + "," + g + "," + b + ")";
      color[i] = rgb;
    }
    return color;
  }

  public String[] randomSize() {
    String[] fontSize = new String[hellos.length];

    for (int i = 0; i < hellos.length; i++) {
      int randomSize = (int) (Math.random() * 45 + 15);
      String size = randomSize + "px";
      fontSize[i] = size;
    }
    return fontSize;
  }
}

package com.greenfoxacademy.springday2.Controller;

import com.greenfoxacademy.springday2.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

  @RequestMapping(value = "/exercise1")
  public String showAccountData(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
    model.addAttribute(bankAccount);

    return "account";
  }
}

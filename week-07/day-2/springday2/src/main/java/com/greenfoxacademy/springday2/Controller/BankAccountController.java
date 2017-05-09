package com.greenfoxacademy.springday2.Controller;

import com.greenfoxacademy.springday2.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

  BankAccount[] accounts = new BankAccount[5];

  @RequestMapping(value = "/exercise1")
  public String showAccountData(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion", false, true);
    model.addAttribute(bankAccount);
    return "account";
  }

  @RequestMapping(value = "/exercise5")
  public String showAllAccount(Model model) {

    accounts[0] = new BankAccount("Simba", 2000, "lion", false, true);
    accounts[1] = new BankAccount("Timon", 1000, "meerkat", false, true);
    accounts[2] = new BankAccount("Scar", 3500, "lion", false, false);
    accounts[3] = new BankAccount("Mufasa", 4000, "lion", true, true);
    accounts[4] = new BankAccount("Pumba", 1, "warthog", false, true);

    model.addAttribute("accounts", accounts);
    return "accounts";
  }
}


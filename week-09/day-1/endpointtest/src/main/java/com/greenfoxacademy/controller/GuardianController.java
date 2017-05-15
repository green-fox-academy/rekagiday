package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.ErrorHandler;
import com.greenfoxacademy.model.Groot;
import com.greenfoxacademy.model.Rocket;
import com.greenfoxacademy.model.ShipFiller;
import com.greenfoxacademy.model.Yondu;
import com.greenfoxacademy.service.GrootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @Autowired
  ErrorHandler errorHandler;

  @Autowired
  Groot groot;

  @GetMapping(value = "/groot")
  public GrootService groot(@RequestParam(value = "message") String message) {
    if (message.length() == 0) {
      return errorHandler;
    }
    groot.setReceived(message);
    return groot;
  }

  @Autowired
  Yondu yondu;

  @GetMapping(value = "/yondu")
  public Yondu yondu(@RequestParam(value = "distance") String distance,
      @RequestParam(value = "time") String time) {
    yondu.setDistance(Double.parseDouble(distance));
    yondu.setTime(Double.parseDouble(time));
    yondu.setSpeed();
    return yondu;
  }

  @Autowired
  Rocket rocket;

  @Autowired
  ShipFiller shipFiller;

  @GetMapping(value = "/rocket")
  public Rocket rocket() {
    return rocket;
  }

  @GetMapping(value = "/rocket/fill")
  public ShipFiller fillship(@RequestParam(value = "caliber") String caliber,
      @RequestParam(value = "amount") int amount) {
    int shipPercentage = (rocket.getCaliber25() + rocket.getCaliber30() + rocket.getCaliber50()) / 125;

    if (caliber.equals(".50")) {
      rocket.setCaliber50(rocket.getCaliber50() + amount);
      shipFiller.setReceived(caliber);
      shipFiller.setAmount(amount);
      shipFiller.setShipstatus(shipPercentage + "%");
      rocket.setShipstatus(shipPercentage + "%");
    } else if (caliber.equals(".30")) {
      rocket.setCaliber30(rocket.getCaliber30() + amount);
      shipFiller.setReceived(caliber);
      shipFiller.setAmount(amount);
      shipFiller.setShipstatus(shipPercentage + "%");
      rocket.setShipstatus(shipPercentage + "%");
    } else if (caliber.equals(".25")) {
      rocket.setCaliber25(rocket.getCaliber25() + amount);
      shipFiller.setReceived(caliber);
      shipFiller.setAmount(amount);
      shipFiller.setShipstatus(shipPercentage + "%");
      rocket.setShipstatus(shipPercentage + "%");
    }
    if (shipPercentage == 100) {
      rocket.setReady(true);
      rocket.setShipstatus("full");
      shipFiller.setReady(true);
      shipFiller.setShipstatus("full");
    } else if (shipPercentage > 100) {
      rocket.setShipstatus("overloaded");
      shipFiller.setShipstatus("overloaded");
    }
    return shipFiller;
  }
}

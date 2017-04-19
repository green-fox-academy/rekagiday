package ParkingLot;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2017. 04. 19..
 */
public class Car {

  carType type;
  carColor color;

  public enum carType {OPEL, BMW, MERCEDES, AUDI, SUZUKI}

  public enum carColor {WHITE, BLACK, RED, SILVER, YELLOW}

  public Car(carType type, carColor color) {
    this.type = type;
    this.color = color;
  }

  public Car() {
  }


}


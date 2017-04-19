package ParkingLot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by User on 2017. 04. 19..
 */
public class ParkingLot extends Car {

  List<Car> parkingLot = new ArrayList<>();


  public ParkingLot(int size) {
    for (int i = 0; i < size; i++) {

      int typeRng = (int) (Math.random() * 5);
      int colorRng = (int) (Math.random() * 5);

      carType type = null;
      carColor color = null;

      if (typeRng == 0) {
        type = carType.OPEL;
      } else if (typeRng == 1) {
        type = carType.BMW;
      } else if (typeRng == 2) {
        type = carType.MERCEDES;
      } else if (typeRng == 3) {
        type = carType.AUDI;
      } else if (typeRng == 4) {
        type = carType.SUZUKI;
      }

      if (colorRng == 0) {
        color = carColor.BLACK;
      } else if (colorRng == 1) {
        color = carColor.RED;
      } else if (colorRng == 2) {
        color = carColor.SILVER;
      } else if (colorRng == 3) {
        color = carColor.WHITE;
      } else if (colorRng == 4) {
        color = carColor.YELLOW;
      }

      Car car = new Car(type, color);
      parkingLot.add(car);
    }
  }

  public void countType() {
    int opelCounter = 0;
    int bmwCounter = 0;
    int audiCounter = 0;
    int mercedesCounter = 0;
    int suzukiCounter = 0;
    for (Car car : parkingLot) {
      if (car.type.equals(carType.OPEL)) {
        opelCounter++;
      } else if (car.type == carType.BMW) {
        bmwCounter++;
      } else if (car.type == carType.AUDI) {
        audiCounter++;
      } else if (car.type == carType.MERCEDES) {
        mercedesCounter++;
      } else if (car.type == carType.SUZUKI) {
        suzukiCounter++;
      }
    }
    System.out.printf("%d Opel, %d BMW, %d Audi, %d Mercedes, %d Suzuki", opelCounter, bmwCounter,
        audiCounter, mercedesCounter, suzukiCounter);
  }


  public void countColor() {
    int redCounter = 0;
    int yellowCounter = 0;
    int blackCounter = 0;
    int whiteCounter = 0;
    int silverCounter = 0;
    for (Car car : parkingLot) {
      if (car.color.equals(carColor.RED)) {
        redCounter++;
      } else if (car.color == carColor.YELLOW) {
        yellowCounter++;
      } else if (car.color == carColor.BLACK) {
        blackCounter++;
      } else if (car.color == carColor.WHITE) {
        whiteCounter++;
      } else if (car.color == carColor.SILVER) {
        silverCounter++;
      }
    }
    System.out
        .printf("%d red cars, %d yellow cars, %d black cars, %d white cars and %d silver cars",
            redCounter, yellowCounter, blackCounter, whiteCounter, silverCounter);
  }

  public void mostPopularCar() {

    HashMap<String, Integer> map = new HashMap<>();

    for (Car car : parkingLot) {
      String thisCar = car.color + " " + car.type;
      if (!map.containsKey(thisCar)) {
        map.put(thisCar, 1);
      } else {
        int count = map.get(thisCar);
        count++;
        map.put(thisCar, count);
      }
    }
    Map.Entry<String, Integer> maxEntry = null;

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
        maxEntry = entry;
      }
    }
    System.out.println(maxEntry);
  }
}



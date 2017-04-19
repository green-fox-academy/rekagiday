package ParkingLot;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2017. 04. 19..
 */
public class CarApp {

  public static void main(String[] args) {

    ParkingLot parkingLot = new ParkingLot(256);
    parkingLot.countColor();
    System.out.println();
    parkingLot.countType();
  }
}

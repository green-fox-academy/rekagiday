package reka.greenfox;
/**
 * Created by User on 2017. 04. 03..
 */
public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();

    Thing milk = new Thing("Get milk");
    Thing obstacles = new Thing("Remove the obstacles");
    Thing standUp = new Thing("Stand up");
    Thing lunch = new Thing("Eat lunch");
    standUp.complete();
    lunch.complete();

    fleet.add(milk);
    fleet.add(obstacles);
    fleet.add(standUp);
    fleet.add(lunch);

    System.out.println(fleet);
  }
}

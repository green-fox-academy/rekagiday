package reka.greenfox;

import java.util.ArrayList;

/**
 * Created by User on 2017. 04. 03..
 */
public class GreenFoxApp {

  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<>();

    Person mark = new Person("Mark", 46, "male");
    people.add(mark);
    Person jane = new Person();
    people.add(jane);
    Mentee john = new Mentee("John Doe", 20, "male", "BME");
    people.add(john);
    Mentee mentee = new Mentee();
    people.add(mentee);
    Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
    people.add(gandhi);
    Mentor mentor = new Mentor();
    people.add(mentor);
    Sponsor sponsor = new Sponsor();
    people.add(sponsor);
    Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
    people.add(elon);

    mentee.skipDays(3);

    for (int i = 0; i < 5; i++) {
      elon.hire();
    }
    for (int i = 0; i < 3; i++) {
      sponsor.hire();
    }

    for(Person person : people) {
      person.introduce();
      person.getGoal();
    }
  }
}

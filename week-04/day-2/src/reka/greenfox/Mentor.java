package reka.greenfox;

/**
 * Created by User on 2017. 04. 03..
 */
public class Mentor extends Person {

  String level;

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    this.level = "intermediate";
  }

    public void introduce() {
    System.out.println("Hello, I am " + name + ", a " + age + " year old " + gender + " " + level + " level mentor.");
  }

  public void getGoal() {
    System.out.println("My goal is to educate brilliant junior software developers.");
  }
}

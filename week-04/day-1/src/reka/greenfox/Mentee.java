package reka.greenfox;

/**
 * Created by User on 2017. 04. 03..
 */
public class Mentee extends Person {

  String name;
  int age;
  String gender;
  String previousOrganization;
  int skippedDays;

  public Mentee(String name, int age, String gender, String previousOrganization) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public Mentee() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  public void introduce() {
    System.out.println("Hello, I am " + name + ", a " + age + " year old " + gender + " from "
        + previousOrganization + " who skipped " + skippedDays + " days already.");
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }
}


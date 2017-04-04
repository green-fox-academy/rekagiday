package reka.greenfox;

/**
 * Created by User on 2017. 04. 03..
 */
public class Sponsor extends Person {

  String company;
  int hiredStudents;

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  public Sponsor() {
    this.company = "Google";
    this.hiredStudents = 0;
  }

  @Override
  public void introduce() {
    System.out.println("Hello, I am " + name + ", a " + age + " year old " + gender + " who represents "
        + company + " and hired " + hiredStudents + " students so far.");
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is to hire brilliant junior software developers");
  }

  public void hire(){
    hiredStudents++;
  }
}

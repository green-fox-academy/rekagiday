package reka.greenfox;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2017. 04. 04..
 */
public class LagopusClass {
  String className;
  public List<Student> students = new ArrayList<>();
  public List<Mentor> mentors = new ArrayList<>();


  public LagopusClass(String className) {
    this.className = className;
  }

  public void addStudent(Student student){
    students.add(student);
  }
  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info(){
    System.out.println("Lagopus "+ className + " class has "+ students.size()+ " students and "
    + mentors.size() + " mentors.");
  }

}


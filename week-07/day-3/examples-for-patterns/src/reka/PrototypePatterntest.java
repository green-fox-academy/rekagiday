package reka;

import java.util.List;

/**
 * Created by User on 2017. 05. 07..
 */
public class PrototypePatterntest {

  public static void main(String[] args) throws CloneNotSupportedException {
    Employees emps = new Employees();
    emps.loadData();

    //Use the clone method to get the Employee object
    Employees empsNew = (Employees) emps.clone();
    Employees empsNew1 = (Employees) emps.clone();
    List<String> list = empsNew.getEmpList();
    list.add("Julcsi");
    List<String> list1 = empsNew1.getEmpList();
    list1.remove("Józsi");

    System.out.println("emps List: " + emps.getEmpList());
    System.out.println("empsNew List: " + list);
    System.out.println("empsNew1 List: " + list1);
  }
}

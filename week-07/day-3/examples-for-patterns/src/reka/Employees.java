package reka;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2017. 05. 07..
 */
public class Employees implements Cloneable{

  private List<String> empList;

  public Employees(){
    empList = new ArrayList<String>();
  }

  public Employees(List<String> list){
    this.empList=list;
  }
  public void loadData(){    //read all employees from database and put into the list
    empList.add("Józsi");
    empList.add("Pisti");
    empList.add("Marcsi");
    empList.add("Julcsi");
  }

  public List<String> getEmpList() {
    return empList;
  }

  @Override
  public Object clone() throws CloneNotSupportedException{
    List<String> temp = new ArrayList<String>();
    for(String s : this.getEmpList()){
      temp.add(s);
    }
    return new Employees(temp);
  }
}

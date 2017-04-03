package reka.greenfox;

/**
 * Created by User on 2017. 04. 01..
 */
public class Tree {

  String type;
  String leafColour;
  int age;
  String sex;

  public Tree(String type, String leafColour, int age, String sex) {
    this.type = type;
    this.leafColour = leafColour;
    this.age = age;
    this.sex = sex;
  }

  Tree maple = new Tree("maple", "red", 154, "male");
  Tree apple = new Tree("apple", "green", 15, "female");
  Tree oak = new Tree("oak", "green", 258, "male");
  Tree sycamore = new Tree("sycamore", "yellow", 79, "female");
  Tree sequoia = new Tree("sequoia", "forest green", 1587, "male");
}

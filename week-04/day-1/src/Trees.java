import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 2017. 04. 01..
 */
public class Trees {

  private static Map<String, Object> createTree(String type, String leafColour, int age,
      String sex) {
    Map<String, Object> tree = new HashMap<>();
    tree.put("type", type);
    tree.put("leafColour", leafColour);
    tree.put("age", age);
    tree.put("sex", sex);
    return tree;
  }

  public static void main(String[] args) {
    Map<String, Object> maple = createTree("maple", "red", 154, "male");
    Map<String, Object> apple = createTree("apple", "green", 15, "female");
    Map<String, Object> oak = createTree("oak", "green", 258, "male");
    Map<String, Object> sycamore = createTree("sycamore", "yellow", 79, "female");
    Map<String, Object> sequoia = createTree("sequoia", "forest green", 1587, "male");

    System.out.println(maple);
    System.out.println(apple);
    System.out.println(oak);
    System.out.println(sycamore);
    System.out.println(sequoia);
  }
}

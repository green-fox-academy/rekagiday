import java.util.*;

/**
 * Created by User on 2017. 03. 23..
 */
public class AppendLetter {

  public static void main(String[] args) {
    ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));

    for (int i = 0; i < far.size(); i++) {
      String animal = far.get(i);
      animal = animal.concat("a");
      far.set(i, animal);
    }

    System.out.println(far);
  }

}

/**
 * Created by User on 2017. 03. 23..
 */
import java.util.*;

public class SwapQuote{
  public static void main(String... args){
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    list.add(2, list.get(5));
    list.remove(6);

    list.add(6, list.get(3));
    list.remove(3);

    for (String i : list )
      System.out.print(i + " ");

  }
}

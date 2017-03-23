/**
 * Created by User on 2017. 03. 23..
 */
import java.util.*;

public class IsInList2{

  public static void main(String... args){
    
    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

    int index1 = list.indexOf(4);
    int index2 = list.indexOf(8);
    int index3 = list.indexOf(12);
    int index4 = list.indexOf(16);

    if (index1 != -1 && index2 != -1 &&index3 != -1 &&index4 != -1){
      System.out.println(true);
    } else {
      System.out.println(false);
    }
  }
}
import java.util.*;
/**
 * Created by User on 2017. 03. 23..
 */

public class CandyShop {
  public static void main(String... args){
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);

    int index = arrayList.indexOf(2);
    arrayList.set(index, "Croissant");

    int index2 = arrayList.indexOf(false);
    arrayList.set(index2, "Icecream");


    System.out.println(arrayList);
  }
}
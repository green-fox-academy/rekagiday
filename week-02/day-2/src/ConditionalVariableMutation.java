/**
 * Created by User on 2017. 03. 21..
 */
public class ConditionalVariableMutation {
  public static void main(String[] args) {
    int a = 24;
    int out = 0;
    if (a % 2 == 0) {
      out = out + 1;
    }
    else {
      out = out;
    }
    System.out.println(out);

    int b = 13;
    String out2 = "";
    if (b >= 10 && b <= 20) {
      out2 = "Sweet";
    }
    else if (b < 10) {
      out2 = "More!";
    }
    else if (b > 20) {
      out2 = "Less!";
    }
    System.out.println(out2);


    int c = 123;
    int credits = 100;
    boolean isBonus = false;

    if (credits >= 50 && !isBonus) {
      c -= 2;
    }
    else if (credits < 50 && !isBonus) {
      c -= 1;
    }
    else if (isBonus) {
      c = c ;
    }
    System.out.println(c);


    int d = 8;
    int time = 120;
    String out3 = "";

    if (d%4 ==0 && time <= 200) {
      out3 = "Check";
    }
    else if (time > 200) {
      out3 = "Time out";
    }
    else {
      out3 = "Run Forest Run!";
    }
    System.out.println(out3);
  }
}

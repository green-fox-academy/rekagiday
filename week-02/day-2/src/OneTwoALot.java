/**
 * Created by User on 2017. 03. 21..
 */
import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type a number");

        int number = scanner.nextInt();

        if (number <= 0 ) {
            System.out.println("not enough");
        }
        else if (number == 1) {
            System.out.println("one");
        }
        else if (number == 2) {
            System.out.println("two");
        }
        else if (number > 2) {
            System.out.println("a lot");
        }


    }
}

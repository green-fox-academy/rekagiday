/**
 * Created by User on 2017. 03. 21..
 */
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type a number");

        int number = scanner.nextInt();

        if (number%2 == 0 ) {
            System.out.println("this is an even number");
        }
            else {
            System.out.println("this is an odd number");

        }

    }
}

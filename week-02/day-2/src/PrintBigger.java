/**
 * Created by User on 2017. 03. 21..
 */

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type a number");

        int a = scanner.nextInt();

        System.out.println("Please type another number");

        int b = scanner.nextInt();

        if (a > b ) {
            System.out.println(a + " is the bigger number");
        }
        else {
            System.out.println(b + " is the bigger number");
        }


    }
}


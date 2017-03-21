/**
 * Created by User on 2017. 03. 21..
 */
import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type your first number");
        int n1 = scanner.nextInt();

        System.out.println("Please type your second number");
        int n2 = scanner.nextInt();

        System.out.println("Please type your third number");
        int n3 = scanner.nextInt();

        System.out.println("Please type your fourth number");
        int n4 = scanner.nextInt();

        System.out.println("Please type your last number");
        int n5 = scanner.nextInt();
        int sum = n1+n2+n3+n4+n5;
        double average = sum/5;

        System.out.println("Sum: " + sum + " Average: " + average);
    }
}

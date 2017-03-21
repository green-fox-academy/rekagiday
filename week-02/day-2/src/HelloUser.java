/**
 * Created by User on 2017. 03. 21..
 */
import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your username: ");

        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user

        String userInput1 = scanner.nextLine();

        // It prints the whole line that was given by the user
        System.out.println("Hello, "+ userInput1 + "!");

        // The program stops and waits for user input that is an integer and to press enter
        int userInput2 = scanner.nextInt();

        // It prints the integer
        System.out.println(userInput2);
    }
}
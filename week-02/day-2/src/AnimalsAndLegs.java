/**
 * Created by User on 2017. 03. 21..
 */
import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many chickens do you have?");

        int chicken = scanner.nextInt();

        System.out.println("How many pigs do you have?");

        int pigs = scanner.nextInt();

        int legs = (chicken*2) + (pigs*4);

        System.out.println("Your animals have " + legs + " legs.");
    }
}

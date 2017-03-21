/**
 * Created by User on 2017. 03. 21..
 */
import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter km: ");

        double km = scanner.nextDouble();
        double miles = km * 0.621371192;

        System.out.println(km + " km = " + miles + " miles" );
    }
}
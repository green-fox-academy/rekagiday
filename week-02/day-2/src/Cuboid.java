/**
 * Created by User on 2017. 03. 21..
 */
public class Cuboid {
    public static void main(String[] args) {

        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double a = 5;
        double b = 3.2;
        double c = 4;

        double surfaceArea = (2 * (a*b)) + (2 * (c*b)) + (2 * (a*c));
        System.out.println("Surface area: " + surfaceArea);

        double volume = a*b*c;
        System.out.println("Volume: " + volume);


    }
}

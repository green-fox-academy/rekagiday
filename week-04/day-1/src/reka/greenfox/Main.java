package reka.greenfox;
import reka.greenfox.cat.Cat;

public class Main {

    public static void main(String[] args) {
        Cat cirmi = new Cat(8, "brown", "male", 25.0, "siamese");
        System.out.println(cirmi.getAge());

        PostIt first = new PostIt("orange", "Idea 1", "blue" );
        PostIt second = new PostIt("pink", "Awesome", "black" );
        PostIt third = new PostIt("yellow", "Superb", "green" );

    }
}


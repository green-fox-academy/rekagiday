/**
 * Created by User on 2017. 04. 17..
 */
public class Zoo {

  public static void main(String[] args) {

    Reptile crocodile = new Reptile("Crocodile");
    Mammal bear = new Mammal("Bear");
    Bird parrot = new Bird("Parrot");

    System.out.println("How do our animals get a baby?");
    System.out.println(crocodile.getName() + crocodile.wantChild());
    System.out.println(bear.getName() + bear.wantChild());
    System.out.println(parrot.getName() + parrot.wantChild());
  }
}


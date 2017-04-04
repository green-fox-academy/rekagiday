package garden;

/**
 * Created by User on 2017. 04. 04..
 */
public class GardenApp {

  public static void main(String[] args) {

    Garden garden = new Garden();

    Tree tree1 = new Tree("orange");
    Tree tree2 = new Tree("purple");

    Flower flower1 = new Flower("yellow");
    Flower flower2 = new Flower("blue");

    garden.addFlowers(flower1);
    garden.addFlowers(flower2);
    garden.addTrees(tree2);
    garden.addTrees(tree1);

    garden.info();

    garden.addWater(40);

    garden.info();

    garden.addWater(70);

    garden.info();
  }
}


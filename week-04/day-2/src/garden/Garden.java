package garden;
import com.sun.org.apache.xpath.internal.SourceTree;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import reka.greenfox.Student;

/**
 * Created by User on 2017. 04. 04..
 */
public class Garden {

  int watercount = 0;

  List<Plant> myGarden = new ArrayList<>();

  public void addFlowers(Flower flower) {
    this.myGarden.add(flower);
  }

  public void addTrees(Tree tree) {
    this.myGarden.add(tree);
  }

  public void info() {
    for (Plant plant : myGarden) {
      if (plant.waterState < plant.needsWater) {
        System.out.print("The " + plant.getColor() + " " +
            " needs water. Current water state: " + plant.waterState + "\n");
      } else {
        System.out.print("The " + plant.getColor() + " " + plant.getClass()
            + " doesn't need water. Current water state: "
            + plant.waterState + "  \n");
      }
    }
    System.out.println();
  }

  public void addWater(int waterTotal) {

    watercount = 0;

    System.out.println("The garden has been watered with: " + waterTotal );

    for (Plant plant : myGarden) {
      if (plant.waterState < plant.needsWater) {
        watercount++;
      }
    }

    for (Plant plant : myGarden) {
      if (plant.waterState < plant.needsWater) {
        plant.waterState += ((waterTotal / watercount) * plant.waterAbsorption);
      }
    }
  }
}


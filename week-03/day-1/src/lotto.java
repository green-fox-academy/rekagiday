import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by User on 2017. 03. 26..
 */
public class lotto {

  public static void main(String[] args) {

    Path filePath = Paths.get("assets/otos.csv");

    try {
      List<String> lines = Files.readAllLines(filePath);
      Map<String, Integer> map = new HashMap<>();
      int numberAppears = 0;

      for (String weeks : lines) {
        String[] weekValues = weeks.split(";");
        // System.out.println(weeks);
        for (int i = weekValues.length - 5; i < weekValues.length; i++) {

          map.put(weekValues[i], numberAppears);
          if (map.containsKey(weekValues[i])) {
            map.put(weekValues[i], numberAppears++);
          }
          System.out.println(map.get(weekValues[i]) + " " + numberAppears);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

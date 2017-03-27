import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Created by User on 2017. 03. 26..
 */
public class lotto {

  public static void main(String[] args) {

    Path filePath = Paths.get("assets/otos.csv");

    try {
      List<String> lines = Files.readAllLines(filePath);
      Map<String, Integer> map = new HashMap<>();

      for (String weeks : lines) {
        String[] weekValues = weeks.split(";");
        for (int i = weekValues.length - 5; i < weekValues.length; i++) {
          if (map.containsKey(weekValues[i])) {
            map.put(weekValues[i], map.get(weekValues[i]) + 1);
          } else {
            map.put(weekValues[i], 0);
          }
        }
      }

      for (Entry myEntry: map.entrySet()) {
        System.out.println(myEntry.getKey() + " " + myEntry.getValue());
      }
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

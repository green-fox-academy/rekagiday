import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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

      Set<Entry<String, Integer>> set = map.entrySet();
      List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(
          set);
      Collections.sort(list, new Comparator<Entry<String, Integer>>() {

        public int compare(Map.Entry<String, Integer> o1,
            Map.Entry<String, Integer> o2) {
          return o2.getValue().compareTo(o1.getValue());
        }
      });

      for (Entry<String, Integer> entry : list) {

        if (entry.getValue() >= 192) {

          System.out.println(entry.getKey() + " : " + entry.getValue());
        }

      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

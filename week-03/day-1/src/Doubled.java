import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by User on 2017. 03. 27..
 */
public class Doubled {

  public static void main(String[] args) {
    try {
      Path filePath = Paths.get("assets/duplicated-chars.txt");
      List<String> lines = Files.readAllLines(filePath);

      for (String line : lines) {
        String[] words = line.split("  ");
        String newLine = "";
        for (String word : words) {
          String newWord = "";
          char[] letters = word.toCharArray();
          for (int i = 0; i < letters.length; i++) {
            if (i%2 == 0) {
              newWord += letters[i];
            }
          }
          newLine += newWord + " ";
        }
        System.out.println(newLine);
      }

    } catch (Exception e) {
      System.out.println("Uh-oh, an error happened: " + e.getClass());
    }
  }
}

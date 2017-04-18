import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2017. 04. 18..
 */
public class Copy {


  public static void main(String[] args) {

    if (args.length == 0) {
      System.out.println("copy [source] [destination]");
    } else if (args.length <= 2) {
      System.out.println("No destination provided");
    } else if (args.length == 3 && args[0].equals("copy")) {
      try {
        Path readFrom = Paths.get(args[1]);
        List<String> content = new ArrayList<>();
        List<String> lines = Files.readAllLines(readFrom);
        for (int i = 0; i < lines.size(); i++) {
          content.add(lines.get(i));
        }
        Path writeTo = Paths.get(args[2]);
        Files.write(writeTo, content);
      } catch (Exception e) {
        System.out.println("Source or destination is not a file");
      }
    }
  }
}


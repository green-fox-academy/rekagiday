import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by User on 2017. 04. 26..
 */
public class FileHandler {

  String path;

  public FileHandler(String path) {
    this.path = path;
  }

  public boolean createIfNoFileExists() {
    Path path = Paths.get(this.path);
    try {
      if (!Files.exists(path)) {
        Files.createFile(path);
        return true;
      }
    } catch (Exception e) {
      System.out.println("Files could not be created.");
      e.printStackTrace();
    }
    return false;
  }

  public List<String> readDataFromFile(String fileToReadPlace) {
    Path path = Paths.get(this.path);
    try {
      return Files.readAllLines(path);
    } catch (Exception e) {
      System.out.println("Error during reading the file");
      e.printStackTrace();
    }
    return null;
  }

  public void writeDataToFile(List<String> taskList) {
    Path path = Paths.get(this.path);
    try {
      Files.write(path, taskList);
    } catch (Exception e) {
      System.out.println("Error during writing the file");
      e.printStackTrace();
    }
  }
}


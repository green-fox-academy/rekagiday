import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2017. 04. 20..
 */
public class OperationHandler extends TaskList {
//
//  Task task = new Task();
//
//
  public void saveTask(String task) {
    try {
      Files.write(path, System.lineSeparator().getBytes(), StandardOpenOption.APPEND);
//      Files.write(path, task.toCsvFormat().getBytes(), StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
//
//  public void load(Integer id) {
//    try {
//      List<String> lines = Files.readAllLines(path);
//      for (String line : lines) {
//        if (line.contains(id.toString())) {
//          System.out.println(line.toString());
//        }
//      }
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//  }
//
//  public void load(String title) {
//    try {
//      List<String> lines = Files.readAllLines(path);
//      for (String line : lines) {
//        if (line.contains(title)) {
//          System.out.println(line.toString());
//        }
//      }
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//  }
//
//
  public void loadAll() {
    try {
      List<String> lines = Files.readAllLines(path);
      for (String line : lines) {
        System.out.println(line.toString());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
//
//
//  @Override
//  public String toString() {
//    return task.getId() + " " + task.getTitle() + " " + task.getCreatedAt() + " " + task
//        .getCompletedAt();
//  }

  public void updateTask(String id) {}

  public void removeTask(String string) {}

  public void checkTask(String string) {}


  void printUsage() {
    Path filePath = Paths.get("src/main/info.csv");
    List<String> lines = null;
    try {
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      e.printStackTrace();
    }
    for (int i = 0; i < lines.size(); i++) {
      System.out.println(lines.get(i));
    }
  }

  public String[] taskToArray(Task task) {
    String[] convertedTask = new String[5];
    convertedTask[0] = String.valueOf(task.getId());
    convertedTask[1] = String.valueOf(task.getCreatedAt());
    convertedTask[2] = String.valueOf(task.getCompletedAt());
    convertedTask[3] = String.valueOf(task.getCompletionTime());
    convertedTask[4] = String.valueOf(task.getTitle());

    return convertedTask;

  }


}


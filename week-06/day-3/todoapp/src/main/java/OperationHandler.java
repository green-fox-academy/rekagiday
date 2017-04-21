import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2017. 04. 20..
 */
public class OperationHandler extends TaskList implements Operations {

  List<Task> tasks = new ArrayList<>();
  Task task = new Task();


  public void saveTask(Task task) {
    try {
      Files.write(path, System.lineSeparator().getBytes(), StandardOpenOption.APPEND);
      Files.write(path, task.toCsvFormat().getBytes(), StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void load(Integer id) {
    try {
      List<String> lines = Files.readAllLines(path);
      for (String line : lines) {
        if (line.contains(id.toString())) {
          System.out.println(line.toString());
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void load(String title) {
    try {
      List<String> lines = Files.readAllLines(path);
      for (String line : lines) {
        if (line.contains(title)) {
          System.out.println(line.toString());
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
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


  @Override
  public String toString() {
    return task.getId() + " " + task.getTitle() + " " + task.getCreatedAt() + " " + task
        .getCompletedAt();
  }

  public void updateTask(int id) {

  }
}


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2017. 04. 21..
 */
public class TaskList extends ArrayList {

  List<Task> tasks = new ArrayList<>();
  Path path;

  public TaskList() {
  }

  public TaskList(String taskPath) {
    this.path = Paths.get(taskPath);
    try {
      List<String> lines = Files.readAllLines(path);
      for (String taskData : lines) {
        String[] data = taskData.split(";");
        Task newTask = new Task(data);
        tasks.add(newTask);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

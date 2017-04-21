import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2017. 04. 20..
 */
public class OperationHandler extends TaskList implements ArgumentHandler{

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
  public void load(int id) {

  }

  @Override
  public void load(String title) {
    for (int i = 0; i < tasks.size(); i++) {
      System.out.println((i + 1) + ".  " + tasks.get(i).toString());
    }

  }

  @Override
  public void loadAll() {
    for (int i = 0; i < tasks.size(); i++) {
      System.out.println((i + 1) + ".  " + tasks.get(i).toString());
    }
  }


  @Override
  public String toString() {
    return task.getId() + " " + task.getTitle()+ " " + task.getCreatedAt()+ " " + task.getCompletedAt();
  }
}


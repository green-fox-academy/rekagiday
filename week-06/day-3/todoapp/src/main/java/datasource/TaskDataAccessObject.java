package datasource;

import entity.Task;
import entity.TaskFactory;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2017. 04. 26..
 */
public class TaskDataAccessObject implements DataAccessObject<Task> {

  private FileHandler fileHandler;

  public TaskDataAccessObject(String path) {
    this.fileHandler = new FileHandler(path);
  }

  @Override
  public void saveAll(List<Task> entities) {
    List<String> entitiesLines = new ArrayList<>();
    for (Task task : entities) {
      entitiesLines.add(task.toDataFormat());
    }
    fileHandler.writeDataToFile(entitiesLines);
  }

  @Override
  public List<Task> loadAll() {
    List<Task> loadedTasks = new ArrayList<>();
    List<String> loadedTasksAsStrings = fileHandler.readDataFromFile();
    for (String lines : loadedTasksAsStrings) {
      String[] taskData = lines.split(";");
      loadedTasks.add(TaskFactory.createTask(taskData));
    }
    return loadedTasks;
  }
}

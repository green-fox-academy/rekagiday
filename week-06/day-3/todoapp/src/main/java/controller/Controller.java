package controller;

import datasource.DataAccessObject;
import datasource.FileHandler;
import datasource.TaskDataAccessObject;
import datasource.UsageDataAccessObject;
import entity.Task;
import entity.TaskFactory;
import entity.Usage;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2017. 04. 26..
 */
public class Controller {

  private DataAccessObject<Task> taskDao;
  private DataAccessObject<Usage> usageDao;

  public Controller() {
    taskDao = new TaskDataAccessObject("tasks.csv");
    usageDao = new UsageDataAccessObject("info.csv");
  }

  public void listTasks() {
    List<Task> tasks = taskDao.loadAll();
    for (Task task : tasks) {
      System.out.println(task.toString());
    }
  }

  public void listUsage() {
    List<Usage> usages = usageDao.loadAll();
    for (Usage usage : usages) {
      System.out.println(usage.toString());
    }
  }

  public void addTask(String title) {
    List<Task> tasks = taskDao.loadAll();
    String[] taskString = new String[4];
    taskString[0] = "111";
    taskString[1] = ZonedDateTime.now().toString();
    taskString[2] = null;
    taskString[3] = title;
    tasks.add(TaskFactory.createTask(taskString));
    this.taskDao.saveAll(tasks);
  }

  public void removeTask(String id) {
    List<Task> tasks = taskDao.loadAll();
    List<Task> listAfterRemove = new ArrayList<>();
    for (Task task : tasks) {
      if (task.getId() != Integer.parseInt(id)) {
        listAfterRemove.add(task);
      }
    }
    this.taskDao.saveAll(listAfterRemove);
  }

  


}






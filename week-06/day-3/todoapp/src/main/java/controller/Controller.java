package controller;

import datasource.DataAccessObject;
import datasource.TaskDataAccessObject;
import datasource.UsageDataAccessObject;
import entity.Task;
import entity.Usage;
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
}


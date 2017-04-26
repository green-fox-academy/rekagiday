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
    taskDao = new TaskDataAccessObject("../datasource/tasks.csv");
    usageDao = new UsageDataAccessObject("../datasource/info.csv");
  }

  public void listTasks() {
    List<Task> tasks = taskDao.loadAll();
    for (Task task: tasks) {
      System.out.println(task.toString());

    }


  }
}

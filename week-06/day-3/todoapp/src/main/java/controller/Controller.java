package controller;

import datasource.DataAccessObject;
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

  public void checkTask(String id) {
    List<Task> tasks = taskDao.loadAll();

    List<Task> listAfterCheck = new ArrayList<>();

    for (Task task : tasks) {
      if (task.getId() != Integer.parseInt(id)) {
        listAfterCheck.add(task);
      }
      if (task.getId() == Integer.parseInt(id)) {
        String[] taskString = new String[4];
        taskString[0] = id;
        taskString[1] = task.getCreatedAt().toString();
        taskString[2] = ZonedDateTime.now().toString();
        taskString[3] = task.getTitle();
        listAfterCheck.add(TaskFactory.createTask(taskString));
      }
    }
    this.taskDao.saveAll(listAfterCheck);
  }

  public void updateTask(String idAndNewTitle) {
    List<Task> tasks = taskDao.loadAll();
    List<Task> listAfterUpdate = new ArrayList<>();

    String id = idAndNewTitle.substring(0, idAndNewTitle.indexOf(" "));
    String newTitle = idAndNewTitle.substring(idAndNewTitle.indexOf(" "));

    for (Task task : tasks) {
      if (task.getId() != Integer.parseInt(id)) {
        listAfterUpdate.add(task);
      }
      if (task.getId() == Integer.parseInt(id)) {
        String[] taskString = new String[4];
        taskString[0] = id;
        taskString[1] = task.getCreatedAt().toString();
        taskString[2] = (task.getCompletedAt() == null) ? null : task.getCompletedAt().toString();
        taskString[3] = newTitle;
        listAfterUpdate.add(TaskFactory.createTask(taskString));
      }
    }
    this.taskDao.saveAll(listAfterUpdate);
  }
}


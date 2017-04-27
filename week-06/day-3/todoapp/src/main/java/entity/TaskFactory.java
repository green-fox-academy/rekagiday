package entity;

import java.time.ZonedDateTime;

public class TaskFactory {

  public static Task createTask(String[] args) {
    int id = Integer.parseInt(args[0]);
    ZonedDateTime createdAt = ZonedDateTime.parse(args[1]);
    ZonedDateTime completedAt = (args[2] == null || args[2].isEmpty()) ? null : ZonedDateTime.parse(args[2]);
    String title = args[3];
    return new Task(title, id, createdAt, completedAt);
  }
}


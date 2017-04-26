import java.time.ZonedDateTime;

/**
 * Created by User on 2017. 04. 26..
 */
public class ToDoFactory {

  public static Task createTask(String[] args) {
    int id = Integer.parseInt(args[0]);
    ZonedDateTime createdAt = ZonedDateTime.parse(args[1]);
    ZonedDateTime completedAt = ZonedDateTime.parse(args[2]);
    String title = args[3];
    return new Task(title, id, createdAt, completedAt);
  }
}


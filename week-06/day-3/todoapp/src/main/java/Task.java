import java.time.ZonedDateTime;

/**
 * Created by User on 2017. 04. 21..
 */
public class Task {

  private String title;
  private int id;
  private static int maxID;
  private ZonedDateTime createdAt;
  private ZonedDateTime completedAt;

  public Task(String title, int id, ZonedDateTime createdAt, ZonedDateTime completedAt) {
    this.title = title;
    this.id = id;
    this.createdAt = createdAt;
    this.completedAt = null;
  }


  public static int getMaxID() {
    return maxID;
  }

  public String getTitle() {
    return title;
  }


  public int getId() {
    return id;
  }


  public ZonedDateTime getCreatedAt() {
    return createdAt;
  }


  public ZonedDateTime getCompletedAt() {
    return completedAt;
  }

//  String toCsvFormat() {
//    return id + ";" + title + ";" + createdAt + ";" + completedAt;
//  }
}

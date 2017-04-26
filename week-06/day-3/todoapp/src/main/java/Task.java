import java.time.LocalDate;
import java.time.LocalDateTime;
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
  private int completionTime;


  public Task(String[] taskData) {
    this.title = taskData[1];
    this.id = id + 1;
    this.createdAt = ZonedDateTime.now();
//    completionTime = getCompletedAt().getDayOfYear()-getCreatedAt().getDayOfYear();
  }

  public Task() {}

  public static int getMaxID() {
    return maxID;
  }

  public static void setMaxID(int maxID) {
    Task.maxID = maxID;
  }

  public int getCompletionTime() {
    return completionTime;
  }

  public void setCompletionTime(int completionTime) {
    this.completionTime = completionTime;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public ZonedDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(ZonedDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ZonedDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(ZonedDateTime completedAt) {
    this.completedAt = completedAt;
  }

  String toCsvFormat() {
    return id + ";" + title + ";" + createdAt + ";" + completedAt;
  }
}

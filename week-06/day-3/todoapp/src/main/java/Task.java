import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by User on 2017. 04. 21..
 */
public class Task {

  private String title;
  private int id;
  private static int maxID;
  private LocalDateTime createdAt;
  private LocalDateTime completedAt;
  private int completionTime;


  public Task(String[] taskData) {
    this.title = taskData[1];
    this.id = id + 1;
    this.createdAt = LocalDateTime.now();
//    completionTime = getCompletedAt().getDayOfYear()-getCreatedAt().getDayOfYear();
  }

  public Task() {}

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

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LocalDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(LocalDateTime completedAt) {
    this.completedAt = completedAt;
  }

  String toCsvFormat() {
    return id + ";" + title + ";" + createdAt + ";" + completedAt;
  }
}

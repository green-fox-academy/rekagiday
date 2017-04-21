import java.time.LocalDate;

/**
 * Created by User on 2017. 04. 21..
 */
public class Task {

  private String title;
  private int id = 0;
  private LocalDate createdAt;
  private LocalDate completedAt;
  int completionTime;


  public Task(String[] taskData) {
    this.title = taskData[1];
    this.id = id + 1;
    this.createdAt = LocalDate.now();
    completionTime = getCompletedAt().getDayOfYear()-getCreatedAt().getDayOfYear();
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

  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }

  public LocalDate getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(LocalDate completedAt) {
    this.completedAt = completedAt;
  }

  String toCsvFormat() {
    return id + ";" + title + ";" + createdAt + ";" + completedAt;
  }
}

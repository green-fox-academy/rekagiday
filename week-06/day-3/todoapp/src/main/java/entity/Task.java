package entity;

import java.time.ZonedDateTime;

/**
 * Created by User on 2017. 04. 21..
 */
public class Task implements Entity {

  private final String title;
  private final int id;
  private final ZonedDateTime createdAt;
  private final ZonedDateTime completedAt;

  public Task(String title, int id, ZonedDateTime createdAt, ZonedDateTime completedAt) {
    this.title = title;
    this.id = id;
    this.createdAt = createdAt;
    this.completedAt = completedAt;
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

  @Override
  public String toDataFormat() {
    String completedAt = this.completedAt == null ? "" : this.completedAt.toInstant().toString();
    return String.format("%s;%s;%s;%s", id, createdAt.toInstant().toString(), completedAt, title);
  }

  @Override
  public String toString() {
    return "#" + id +
        "title = " + title + '\'' +
        ", createdAt = " + createdAt +
        ", completedAt = " + completedAt +
        '}';
  }
}


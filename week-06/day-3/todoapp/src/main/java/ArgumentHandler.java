/**
 * Created by User on 2017. 04. 21..
 */
public interface ArgumentHandler {

  void saveTask(Task task);
  void load(int id);
  void load(String title);
  void loadAll();
}

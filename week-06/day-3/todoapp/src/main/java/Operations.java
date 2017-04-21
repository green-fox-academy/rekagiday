/**
 * Created by User on 2017. 04. 21..
 */
public interface Operations {

  void saveTask(Task task);
  void load(Integer id);
  void load(String title);
  void loadAll();
}

package datasource;

import entity.Entity;
import java.util.List;

/**
 * Created by User on 2017. 04. 26..
 */
public interface DataAccessObject <T extends Entity> {

  void saveAll(List<T> entities);

  List<T> loadAll();

}

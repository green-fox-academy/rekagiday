package datasource;

import entity.Usage;
import entity.UsageFactory;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2017. 04. 26..
 */
public class UsageDataAccessObject implements DataAccessObject<Usage> {

  private FileHandler fileHandler;

  public UsageDataAccessObject(FileHandler fileHandler) {
    this.fileHandler = fileHandler;
  }

  @Override
  public void saveAll(List<Usage> entities) {
    System.out.println("Cannot save different usages.");
  }

  @Override
  public List<Usage> loadAll() {
    List<Usage> loadedUsage = new ArrayList<>();
    List<String> loadedUsagesAsStrings = fileHandler.readDataFromFile();
    for (String lines : loadedUsagesAsStrings) {
      String[] usageData = lines.split(";");
      loadedUsage.add(UsageFactory.createUsage(usageData));
    }
    return loadedUsage;
  }
}

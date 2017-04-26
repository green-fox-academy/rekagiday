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

  public UsageDataAccessObject(String path) {
    this.fileHandler = new FileHandler(path);
  }

  @Override
  public void saveAll(List<Usage> entities) {
    System.out.println("Cannot save different usages.");
  }

  @Override
  public List<Usage> loadAll() {
    List<Usage> loadedUsage = new ArrayList<>();
    List<String> loadedUsagesAsStrings = fileHandler.readDataFromFile();
    for (String line : loadedUsagesAsStrings) {
      String[] usageData = line.split(";");
      loadedUsage.add(UsageFactory.createUsage(usageData));
    }
    return loadedUsage;
  }
}


package entity;

/**
 * Created by User on 2017. 04. 26..
 */
public class UsageFactory {

  public static Usage createUsage(String[] usages) {
    return new Usage(usages[0], usages[1], usages[2]);
  }
}


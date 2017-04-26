package datasource;

import java.io.File;
import java.util.List;

/**
 * Created by User on 2017. 04. 26..
 */
public abstract class FileHandler {

  private String filePath;

//  public static boolean isTodoFileExist() {
//    try {
//      File f = new File();
//      if (!f.exists()) {
//        System.out.println("This todo file did not exist");
//        return false;
//      } else {
//        System.out.println("This todo file exists already");
//      }
//    } catch (Exception e) {
//      System.out.println("Error during testing if file exists or not...");
//      e.printStackTrace();
//    }
//    return true;
//  }

//  public static void createTodoFile() {
//    try {
//      File f = new File();
//      f.createNewFile();
//      System.out.println("This todo file has just been created");
//    } catch (Exception e) {
//      System.out.println("Error during creating the file");
//      e.printStackTrace();
//    }
//  }

  public abstract List<String> readFromFile(String path);

  public abstract void writeToFile(String fileToWritePlace, List<String[]> dataToWrite);
}


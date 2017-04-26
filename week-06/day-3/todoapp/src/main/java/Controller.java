import joptsimple.OptionParser;
import joptsimple.OptionSet;

/**
 * Created by User on 2017. 04. 26..
 */
public class Controller {

  void handleArgument(String[] args) {

    OperationHandler toDoList = new OperationHandler();
    OptionParser parser = new OptionParser();

    parser.accepts("l");
    parser.accepts("a").withOptionalArg();
    parser.accepts("r").withOptionalArg();
    parser.accepts("c").withOptionalArg();
    parser.accepts("u").withOptionalArg();

    OptionSet options = parser.parse(args);

    if (!options.hasOptions()) {
      System.out.println("Invalid command");
      toDoList.printUsage();
    }

    if (options.has("l")) {
      toDoList.loadAll();
    }

    if (options.hasArgument("a")) {
      toDoList.saveTask(options.valueOf("a").toString());
    }

    if (options.hasArgument("r")) {
      toDoList.removeTask(options.valueOf("r").toString());
    }

    if (options.hasArgument("c")) {
      toDoList.checkTask(options.valueOf("c").toString());
    }

//    if (options.hasArgument("u")) {
//      toDoList.updateTask(options.valueOf("u").toString());
//    }
  }
}

import controller.Controller;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

/**
 * Created by User on 2017. 04. 26..
 */
public class ArgumentHandler {

  void handleArgument(String[] args) {

    OptionParser parser = new OptionParser();
    Controller controller = new Controller();

    parser.accepts("l");
    parser.accepts("a").withOptionalArg();
    parser.accepts("r").withOptionalArg();
    parser.accepts("c").withOptionalArg();
    parser.accepts("u").withOptionalArg();

    OptionSet options = parser.parse(args);

    if (args == null || args.length == 0) {
      System.out.println("Invalid command");
      controller.listUsage();
      return;
    }

    if (options.has("l")) {
      controller.listTasks();
    }

//    if (options.hasArgument("a")) {
//      toDoList.saveTask(options.valueOf("a").toString());
//    }
//
//    if (options.hasArgument("r")) {
//      toDoList.removeTask(options.valueOf("r").toString());
//    }
//
//    if (options.hasArgument("c")) {
//      toDoList.checkTask(options.valueOf("c").toString());
//    }

//    if (options.hasArgument("u")) {
//      toDoList.updateTask(options.valueOf("u").toString());
//    }
  }
}

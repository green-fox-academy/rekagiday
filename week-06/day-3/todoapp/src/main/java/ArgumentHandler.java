/**
 * Created by User on 2017. 04. 21..
 */
public class ArgumentHandler {

  String[] args;
  TaskList list = new TaskList();
  OperationHandler handler = new OperationHandler();


  public ArgumentHandler(String[] args) {
    this.args = args;
  }

  void checkArguments(String[] args) {

    if (args[0].charAt(0) != '-' || args.length == 0) {
      System.out.println("Unsupported argument");
      System.out.println();
    } else if (args[0].contains("-l")) {
      handler.loadAll();
    } else if (args[0]. contains("-s")) {
      handler.saveTask(task);
    } else if (args[0].

        contains("-r"))

    {
      list.removeTask();
    } else if (args[0].

        contains("-c"))

    {
      task.checkTask();
    }
  }

}

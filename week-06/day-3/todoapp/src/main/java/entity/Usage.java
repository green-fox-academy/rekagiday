package entity;

/**
 * Created by User on 2017. 04. 26..
 */
public class Usage implements Entity {

  private final String command;
  private final String argument;
  private final String description;

  public Usage(String command, String argument, String description) {
    this.command = command;
    this.argument = argument;
    this.description = description;
  }

  public String getCommand() {
    return command;
  }

  public String getArgument() {
    return argument;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public String toDataFormat() {
    return String.format("%s;%s;%s", command, argument, description);
  }

}

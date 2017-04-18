package music;

/**
 * Created by User on 2017. 04. 18..
 */
public class Violin extends StringedInstrument {

  public Violin() {
    this.name = "Violin";
    this.numberOfStrings = 4;
  }

  public Violin(int numberOfStrings) {
    this.name = "Violin";
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public String play() {
    return "screech";
  }
}

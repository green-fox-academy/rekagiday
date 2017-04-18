package music;

/**
 * Created by User on 2017. 04. 18..
 */
public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    this.name = "Bass guitar";
    this.numberOfStrings = 4;
  }

  public BassGuitar(int numberOfStrings) {
    this.name = "Bass guitar";
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public String play() {
    return "duum-duum-duum";
  }
}

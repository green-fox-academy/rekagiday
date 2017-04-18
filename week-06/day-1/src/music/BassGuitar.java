package music;

/**
 * Created by User on 2017. 04. 18..
 */
public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    this.name = "Bass guitar";
    this.numberOfStrings = 4;
    this.sound = "duuum duuum duum";
  }

  public BassGuitar(int numberOfStrings) {
    this.name = "Bass guitar";
    this.numberOfStrings = numberOfStrings;
    this.sound = "duuum duuum duum";
  }

}

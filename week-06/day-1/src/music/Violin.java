package music;

/**
 * Created by User on 2017. 04. 18..
 */
public class Violin extends StringedInstrument {

  public Violin() {
    this.name = "Violin";
    this.numberOfStrings = 4;
    this.sound = "screeeech";
  }

  public Violin(int numberOfStrings) {
    this.name = "Violin";
    this.numberOfStrings = numberOfStrings;
    this.sound = "screeeech";
  }


}

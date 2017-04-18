package music;

/**
 * Created by User on 2017. 04. 18..
 */
public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    this.numberOfStrings = 6;
    this.sound = "twaaang";
  }

  public ElectricGuitar(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
    this.name = "Electric guitar";
    this.sound = "twaaang";
  }
}

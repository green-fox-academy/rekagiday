package music;

/**
 * Created by User on 2017. 04. 18..
 */
public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    this.numberOfStrings = 6;
  }

  public ElectricGuitar(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
    this.name = "Electric guitar";
  }

  @Override
  public String play() {
    return "twaaang";
  }
}

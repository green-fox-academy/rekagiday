package music;

/**
 * Created by User on 2017. 04. 18..
 */
abstract public class StringedInstrument extends Instrument {

  int numberOfStrings;
  final String formatForPlay = "%s, a %d-stringed instrument that %s\n";

  @Override
  public void play() {
    System.out.printf(formatForPlay, name, numberOfStrings, sound);
  }
}

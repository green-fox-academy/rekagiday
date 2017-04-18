package Zoo;

/**
 * Created by User on 2017. 04. 17..
 */
public class Oviparous extends Animal {

  public Oviparous(String name) {
    super(name);
  }

  @Override
  void eat() {

  }

  @Override
  void sleep() {

  }

  @Override
  void greet() {
  }

  @Override
  String wantChild() {
    return " lays eggs";
  }
}

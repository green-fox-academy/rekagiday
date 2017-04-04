package carrier;

/**
 * Created by User on 2017. 04. 04..
 */
public class Aircraft {

  int hasAmmo;
  int maxAmmo;
  int baseDmg;
  String type;

  public int fight() {
    int damage = hasAmmo * baseDmg;
    return damage;
  }

  public int refill(int refillAmount) {
    int remainingAmmo = refillAmount - maxAmmo;
    this.hasAmmo = maxAmmo;
    return remainingAmmo;
  }

  public String getType() {
    return this.type;
  }

  public String getStatus() {
    return "Type: " + this.type + ", Ammo: " + hasAmmo + ", Base damage: " + baseDmg
        + ", All damage: " + (hasAmmo * baseDmg);
  }

}


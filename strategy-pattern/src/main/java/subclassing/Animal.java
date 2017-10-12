package subclassing;

/**
 * Created by pabel on 10/11/17.
 */
public class Animal {

  protected static final boolean isLiving = true;
  protected static final String feature = "breathes";

  public String move() {
    return "move";
  }

  public String sound() {
    return "sound";
  }

  public String eat() {
    return "eat";
  }

}

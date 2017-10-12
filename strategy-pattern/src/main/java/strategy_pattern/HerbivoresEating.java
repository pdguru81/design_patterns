package strategy_pattern;

import strategy_pattern.interfaces.Eating;

/**
 * Created by pabel on 10/12/17.
 */
public class HerbivoresEating implements Eating {
  public String eat() {
    return "grass";
  }
}

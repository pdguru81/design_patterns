package strategy_pattern;

import strategy_pattern.interfaces.Sound;

/**
 * Created by pabel on 10/12/17.
 */
public class AnimalSound implements  Sound {
  public String sound() {
    return "sound";
  }
}

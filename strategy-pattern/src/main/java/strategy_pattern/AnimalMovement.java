package strategy_pattern;

import strategy_pattern.interfaces.Movement;

/**
 * Created by pabel on 10/12/17.
 */
public class AnimalMovement implements Movement{

  public String move() {
    int test = 100 %2;
    return "move "+ test;
  }
}

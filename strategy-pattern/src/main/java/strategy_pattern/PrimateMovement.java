package strategy_pattern;

import strategy_pattern.interfaces.Movement;

/**
 * Created by pabel on 10/12/17.
 */
public class PrimateMovement implements Movement {

  public String move(){
    return "run on two feet";
  }
}

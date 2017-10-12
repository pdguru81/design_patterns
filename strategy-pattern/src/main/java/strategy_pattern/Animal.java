package strategy_pattern;

import strategy_pattern.interfaces.Eating;
import strategy_pattern.interfaces.Movement;
import strategy_pattern.interfaces.Sound;

/**
 *
 * Uses composition to implement strategy-pattern. Avoids the use of inheritance
 *
 * Note that strategy patterns decouples different implementation of the same algorithms that could be invoked in objects.
 * Created by pabel on 10/12/17.
 */
public class Animal {
  private final Movement movement;
  private final Sound sound;
  private final Eating eating;


  public Animal(Movement movement, Sound sound, Eating eating) {
    this.movement = movement;
    this.sound = sound;
    this.eating = eating;
  }


  public String eat() {
    return this.eating.eat();
  }

  public String move() {
    return this.movement.move();
  }

  public String sound() {
    return this.sound.sound();
  }

}

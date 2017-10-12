package strategy_pattern;

/**
 * Created by pabel on 10/12/17.
 */
public class Test {

  public static void main(String [] args) {

    //now how we can pass each class instance with custom behaviors and combine them easily to form new objects like Vegetarians
    Animal animal = new Animal(new AnimalMovement(), new AnimalSound(), new AnimalEating() );
    Animal herbivores = new Animal(new AnimalMovement(), new AnimalSound(), new HerbivoresEating());
    Animal primate = new Animal(new PrimateMovement(), new AnimalSound(), new PrimateEating());
    Animal vegetarians = new Animal(new PrimateMovement(), new AnimalSound(), new HerbivoresEating());

    System.out.println("Animals : " + animal.eat() + " "+ animal.move() + " "+ animal.sound());
    System.out.println("Herbivores : " + herbivores.eat() + " "+ herbivores.move() + " "+ herbivores.sound());
    System.out.println("primates : " + primate.eat() + " "+ primate.move() + " "+ primate.sound());
    System.out.println("Vegetarians : " + vegetarians.eat() + " "+ vegetarians.move() + " "+ vegetarians.sound());

  }
}

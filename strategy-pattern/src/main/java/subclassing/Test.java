package subclassing;

/**
 * Created by pabel on 10/12/17.
 */
public class Test {

  public static void main (String []args) {
    Animal animal = new Animal();
    Herbivores herbivores = new Herbivores();
    //note how we had to define vegetarian class here that uses duplicated code from herbivores...bad! because
    //the code cannot be as well maintained and easily tested.
    Vegetarians vegetarians = new Vegetarians();
    Primate primate = new Primate();
    System.out.println("Animals : " + animal.eat() + " "+ animal.move() + " "+ animal.sound());
    System.out.println("Herbivores : " + herbivores.eat() + " "+ herbivores.move() + " "+ herbivores.sound());
    System.out.println("primates : " + primate.eat() + " "+ primate.move() + " "+ primate.sound());
    System.out.println("Vegetarians : " + vegetarians.eat() + " "+ vegetarians.move() + " "+ vegetarians.sound());

  }
}

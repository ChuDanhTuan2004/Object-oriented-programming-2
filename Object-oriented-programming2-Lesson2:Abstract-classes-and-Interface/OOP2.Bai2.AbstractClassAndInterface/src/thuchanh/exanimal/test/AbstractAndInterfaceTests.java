package thuchanh.exanimal.test;
import thuchanh.exanimal.animal.Animal;
import thuchanh.exanimal.animal.Chicken;
import thuchanh.exanimal.animal.Tiger;
import thuchanh.exanimal.edible.Edible;
import thuchanh.exanimal.fruit.Fruit;
import thuchanh.exanimal.fruit.Orange;
import thuchanh.exanimal.fruit.Apple;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}

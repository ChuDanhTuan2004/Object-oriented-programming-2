package thuchanh.exanimalandcat.animalandcattest;
import thuchanh.exanimalandcat.animal.Animal2;
import thuchanh.exanimalandcat.animal.Cat;
import thuchanh.exanimalandcat.edibleanimalandcat.Edible2;

public class AbstractAndInterfaceTests2 {
    public static void main(String[] args) {
        Animal2[] animals = new Animal2[1];
        animals[0] = new Cat();
        for (Animal2 animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Cat) {
                Edible2 edibler = (Cat) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}

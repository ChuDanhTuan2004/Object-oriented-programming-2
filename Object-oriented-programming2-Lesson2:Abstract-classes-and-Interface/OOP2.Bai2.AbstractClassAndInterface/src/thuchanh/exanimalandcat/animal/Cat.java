package thuchanh.exanimalandcat.animal;
import thuchanh.exanimalandcat.edibleanimalandcat.Edible2;

public class Cat extends Animal2 implements Edible2 {
    @Override
    public String makeSound() {
        return "Cat: meow meow!";
    }

    @Override
    public String howToEat() {
        return "mouth";
    }
}

package com.animaltest;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal);

        Animal animal1 = new Animal(5, 6);
        System.out.println(animal1);

        Animal animal2 = new Animal();
        animal2.setHeight(1);
        animal2.setWeight(10);
        System.out.println(animal2);
    }

}

package com.animaltest;

public class CatTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat);

        cat = new Cat(3.5);
        System.out.println(cat);

        cat = new Cat(3.5, 5, 10);
        System.out.println(cat);
    }
}

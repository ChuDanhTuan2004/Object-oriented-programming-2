package com.animaltest;

public class Cat extends Animal {
    private double age;

    public Cat() {
        super();
        this.age = 1.0;
    }

    public Cat(double age) {
        super();
        this.age = age;
    }

    public Cat(double weight, double height, double age) {
        super(weight, height);
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String sound() {
        return "Meo meo.....";
    }

    public String eat() {
        return "Mouse!!!";
    }

    @Override
    public String toString() {
        return "A Cat with age: "
                + getAge()
                + ", which is a subclass of "
                + super.toString();
    }

}

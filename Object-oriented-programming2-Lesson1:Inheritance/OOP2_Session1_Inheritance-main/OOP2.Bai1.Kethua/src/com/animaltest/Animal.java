package com.animaltest;

public class Animal {
    private double weight;
    private double height;

    public Animal() {
        this.weight = 0.0;
        this.weight = 0.0;
    }

    public Animal(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "A Animal with weight: "
                + getWeight()
                + " and "
                + "height: "
                + getHeight();
    }
}

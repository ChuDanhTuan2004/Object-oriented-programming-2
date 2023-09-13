package com.circleandcylindertest;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    public double getSurfaceArea() {
        double baseArea = super.getArea();
        double lateralArea = 2 * Math.PI * getRadius() * getHeight();
        return baseArea + lateralArea;
    }

    @Override
    public String toString() {
        return "Cylinder[height=" + height + "," + super.toString() + "]";
    }
}

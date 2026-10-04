package org.example;

/**
 * A circle defined by its radius.
 */
public class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    /** A = πr² */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /** C = 2πr */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
package org.example;

/**
 * A rectangle defined by its length and width.
 */
public class Rectangle extends Shape implements Polygon {

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    /** A = ℓw */
    @Override
    public double getArea() {
        return length * width;
    }

    /** P = 2(ℓ + w) */
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    /** A rectangle has four sides. */
    @Override
    public int numberOfSides() {
        return 4;
    }
}
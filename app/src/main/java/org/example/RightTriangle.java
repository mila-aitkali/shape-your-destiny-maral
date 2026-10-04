package org.example;

/**
 * A right triangle defined by the lengths of its two legs.
 */
public class RightTriangle extends Shape implements Polygon {

    private final double length;
    private final double width;

    public RightTriangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    /** A = ½ℓw */
    @Override
    public double getArea() {
        return 0.5 * length * width;
    }

    /** P = ℓ + w + √(ℓ² + w²) */
    @Override
    public double getPerimeter() {
        double hypotenuse = Math.sqrt(length * length + width * width);
        return length + width + hypotenuse;
    }

    /** A right triangle has three sides. */
    @Override
    public int numberOfSides() {
        return 3;
    }
}
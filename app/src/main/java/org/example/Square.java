package org.example;

/**
 * A square is a rectangle whose length and width are equal.
 * Only the constructor needs to change; getArea(), getPerimeter()
 * and numberOfSides() are all inherited from Rectangle.
 */
public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return getLength();
    }
}
package org.example;

/**
 * An isosceles right triangle is a right triangle whose two legs are equal.
 * Only the constructor needs to change; getArea(), getPerimeter()
 * and numberOfSides() are all inherited from RightTriangle.
 */
public class IsoscelesRightTriangle extends RightTriangle {

    public IsoscelesRightTriangle(double leg) {
        super(leg, leg);
    }

    public double getLeg() {
        return getLength();
    }
}
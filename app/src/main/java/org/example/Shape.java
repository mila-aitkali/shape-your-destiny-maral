package org.example;

/**
 * Abstract base class for all shapes.
 * Every shape must be able to report its area and perimeter.
 */
public abstract class Shape {

    /** @return the area of this shape */
    public abstract double getArea();

    /** @return the perimeter (or circumference) of this shape */
    public abstract double getPerimeter();
}
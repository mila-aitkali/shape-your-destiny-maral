package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IsoscelesRightTriangleTest {
    private static final double DELTA = 1e-9;

    @Test
    void areaIsHalfLegSquared() {
        IsoscelesRightTriangle t = new IsoscelesRightTriangle(2);
        assertEquals(2.0, t.getArea(), DELTA);
    }

    @Test
    void perimeterIsTwoLegsPlusHypotenuse() {
        // legs of 2 -> hypotenuse 2√2
        IsoscelesRightTriangle t = new IsoscelesRightTriangle(2);
        assertEquals(4 + 2 * Math.sqrt(2), t.getPerimeter(), DELTA);
    }

    @Test
    void hasThreeSides() {
        Polygon p = new IsoscelesRightTriangle(2);
        assertEquals(3, p.numberOfSides());
    }

    @Test
    void isARightTriangle() {
        RightTriangle t = new IsoscelesRightTriangle(2);
        assertEquals(t.getLength(), t.getWidth(), DELTA);
    }
}
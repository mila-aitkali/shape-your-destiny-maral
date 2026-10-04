package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RightTriangleTest {
    private static final double DELTA = 1e-9;

    @Test
    void areaIsHalfLengthTimesWidth() {
        RightTriangle t = new RightTriangle(3, 4);
        assertEquals(6.0, t.getArea(), DELTA);
    }

    @Test
    void perimeterIncludesHypotenuse() {
        // 3-4-5 triangle: 3 + 4 + 5 = 12
        RightTriangle t = new RightTriangle(3, 4);
        assertEquals(12.0, t.getPerimeter(), DELTA);
    }

    @Test
    void hasThreeSides() {
        Polygon p = new RightTriangle(3, 4);
        assertEquals(3, p.numberOfSides());
    }
}
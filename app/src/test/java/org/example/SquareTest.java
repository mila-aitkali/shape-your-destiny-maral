package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SquareTest {
    private static final double DELTA = 1e-9;

    @Test
    void areaIsSideSquared() {
        Square s = new Square(5);
        assertEquals(25.0, s.getArea(), DELTA);
    }

    @Test
    void perimeterIsFourTimesSide() {
        Square s = new Square(5);
        assertEquals(20.0, s.getPerimeter(), DELTA);
    }

    @Test
    void hasFourSides() {
        Polygon p = new Square(5);
        assertEquals(4, p.numberOfSides());
    }

    @Test
    void squareIsARectangle() {
        Rectangle r = new Square(5);
        assertEquals(r.getLength(), r.getWidth(), DELTA);
    }
}
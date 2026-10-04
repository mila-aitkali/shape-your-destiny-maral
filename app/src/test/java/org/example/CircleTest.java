package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CircleTest {
    private static final double DELTA = 1e-9;

    @Test
    void areaIsPiRSquared() {
        Circle c = new Circle(3);
        assertEquals(Math.PI * 9, c.getArea(), DELTA);
    }

    @Test
    void perimeterIsTwoPiR() {
        Circle c = new Circle(3);
        assertEquals(6 * Math.PI, c.getPerimeter(), DELTA);
    }

    @Test
    void circleIsAShape() {
        Shape s = new Circle(1);
        assertEquals(Math.PI, s.getArea(), DELTA);
    }
}
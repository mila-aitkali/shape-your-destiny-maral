package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    private static final double DELTA = 1e-9;

    @Test
    void areaIsLengthTimesWidth() {
        Rectangle r = new Rectangle(4, 5);
        assertEquals(20.0, r.getArea(), DELTA);
    }

    @Test
    void perimeterIsTwiceLengthPlusWidth() {
        Rectangle r = new Rectangle(4, 5);
        assertEquals(18.0, r.getPerimeter(), DELTA);
    }

    @Test
    void hasFourSides() {
        Polygon p = new Rectangle(4, 5);
        assertEquals(4, p.numberOfSides());
    }
}
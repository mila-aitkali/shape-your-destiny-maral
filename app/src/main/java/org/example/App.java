package org.example;

/**
 * Driver program that demonstrates the shape hierarchy.
 */
public class App {

    /** Kept from the starter code so the existing AppTest still works. */
    public String getGreeting() {
        return "You can write a driver program for your code here!";
    }

    public static void main(String[] args) {
        // Polymorphism: every object is stored as a Shape,
        // yet each one runs its own getArea() and getPerimeter().
        Shape[] shapes = {
            new Circle(3),
            new Rectangle(4, 5),
            new RightTriangle(3, 4),
            new Square(5),
            new IsoscelesRightTriangle(2)
        };
        String[] labels = {
            "Circle (r=3):",
            "Rectangle (4x5):",
            "RightTriangle (3,4):",
            "Square (5):",
            "IsoscelesRightTriangle (2):"
        };

        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            String line = String.format("%-28s area = %.2f, perimeter = %.2f",
                    labels[i], shape.getArea(), shape.getPerimeter());

            // Only polygons have sides; a Circle is not a Polygon.
            if (shape instanceof Polygon polygon) {
                line += ", sides = " + polygon.numberOfSides();
            }
            System.out.println(line);
        }
    }
}
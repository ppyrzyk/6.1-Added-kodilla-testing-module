package com.kodilla.testing.shape;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("ShapeCollector tests")
public class ShapeCollectorTestSuite {


    @Nested
    @DisplayName("Shape test")
    public class ShapeTester {
        @DisplayName("Adding a shape")
        @Test
        public void testAddShape() {
            //      Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(5.0);
            Circle circle = new Circle(3.3, 3.14);
            //      When
            shapeCollector.addShape(square);
            shapeCollector.addShape(circle);
            //      Then
            Assertions.assertEquals(square, shapeCollector.getShape(0));

        }

        @DisplayName("Removing an added shape")
        @Test
        public void testRemoveShape() {
            //      Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(5.0);
            shapeCollector.addShape(square);
            //      When
            boolean result = shapeCollector.removeShape(square);
            //      Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getSize());
        }

        @DisplayName("Testing getting a shape")
        @Test
        public void testGetShape() {
            //      Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(6.5);
            shapeCollector.addShape(square);
//                   When
            Shape result = shapeCollector.getShape(0);
//                   Then
            Assertions.assertEquals(square, result);
        }

        @DisplayName("Testing showing shapes in a String")
        @Test
        public void testGetShowShapes() {
            //      Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(4.5, 3.14);
            Square square = new Square(9.0);
            shapeCollector.addShape(circle);
            shapeCollector.addShape(square);
//                   When
            String shape = shapeCollector.getShowShapes();
//                   Then
            Assertions.assertNotNull(shape);

        }
    }
}

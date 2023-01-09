package com.kodilla.testing.shape;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("ShapeCollector tests")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;


    ShapeCollector shapeCollector;
    Shape shape;

    @BeforeAll
    public static void before() {
        System.out.println("Testing is starting!");
    }
    @AfterAll
    public static void after() {
        System.out.println("Testing terminated !");
    }
    @BeforeEach
    void setup() {
        shapeCollector = new ShapeCollector();
        testCounter++;
        System.out.println("Test #" + testCounter + " is starting");
    }
    @Nested
    @DisplayName("Shape test")
    public class ShapeTester {
        @DisplayName("Adding a shape")
        @Test
        public void testAddShape() {
            //      Given
            Square square = new Square(5.0);
            Circle circle = new Circle(3.3, 3.14);
            //      When
//square index 0, circle index 1, every next added object(shape) gets the following number
            shapeCollector.addShape(square);
            shapeCollector.addShape(circle);
            //      Then
            assertEquals(square, shapeCollector.getShape(0));

        }

        @DisplayName("Removing an added shape")
        @Test
        public void testRemoveShape() {
            //      Given
            Square square = new Square(5.0);
            shapeCollector.addShape(square);
            //      When
            boolean result = shapeCollector.removeShape(square);
            //      Then
            Assertions.assertTrue(result);
            assertEquals(0, shapeCollector.getSize());
        }

        @DisplayName("Testing getting a shape")
        @Test
        public void testGetShape() {
            //      Given
            Square square = new Square(6.5);
            shapeCollector.addShape(square);
            shapeCollector.addShape(square);
            shapeCollector.addShape(square);
            shapeCollector.addShape(square);

          // When
            Shape result= shapeCollector.getShape(0);
            Shape result1= shapeCollector.getShape(1);
            Shape result2= shapeCollector.getShape(2);
            Shape result3= shapeCollector.getShape(3);

          // Then
            assertEquals(square, result3);
        }

        @DisplayName("Testing showing shapes in a String")
       @Test
        public void testShowShapes() {
        //Given
            Circle circle = new Circle(4.5,3.14);
            Square square= new Square(9.0);
            shapeCollector.addShape(square);
            shapeCollector.addShape(circle);

        //When
            int expected =  shapeCollector.getSize();
        //Then
            assertEquals(2, expected);
        }
        @DisplayName("Testing getting Area")
        @Test
        public void getArea() {
            //Given
            Circle circle= new Circle(5, 3.14);
            Square square= new Square(3.0);
            Triangle triangle = new Triangle(4.0, 5.0);
            //When
            double circ = circle.getShapeArea();
            double squa = square.getShapeArea();
            double tria = triangle.getShapeArea();
            //Then
            assertEquals(78.5, circ, 0.1);
            assertEquals(9.0, squa);
            assertEquals(10, tria);
        }

        }
}
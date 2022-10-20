package com.kodilla.testing.shape;


import org.junit.jupiter.api.*;

@DisplayName("ShapeCollector tests")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;


    ShapeCollector shapeCollector;

    @BeforeAll
    public static void before() {
        System.out.println("Testing is starting!");
    }
    @AfterAll
    public static void after() {
        System.out.println("Testing terminated !");
    }
    @BeforeEach
    public void setup() {
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
            Assertions.assertEquals(circle, shapeCollector.getShape(1));

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
            Assertions.assertEquals(0, shapeCollector.getSize());
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

//                   When
            Shape result= shapeCollector.getShape(0);
            Shape result1= shapeCollector.getShape(1);
            Shape result2= shapeCollector.getShape(2);
            Shape result3= shapeCollector.getShape(3);

//                   Then
            Assertions.assertEquals(square, result3);
        }
//        @DisplayName("Testing showing shapes in a String")
//        @Test
//        public void testGetShowShapes() {
//            //      Given
//            Circle circle = new Circle(4.5,3.14);
//            Square square = new Square(9.0);
//            shapeCollector.addShape(circle);
//            shapeCollector.addShape(square);
////                   When
//            String shape = shapeCollector.getShowShapes();
////                   Then
//            Assertions.assertNotNull(shape);
//
//        }
    }
}
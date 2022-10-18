package com.kodilla.testing.shape;

public class Square implements Shape {


    private double side;

    public Square( Double area) {

        this.side = side;
    }

    public String getShapeName() {
        return "Square";
    }

    public double getShapeArea() {
        return side*side;
    }

}

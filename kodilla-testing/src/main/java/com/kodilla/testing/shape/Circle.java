package com.kodilla.testing.shape;

public class Circle implements Shape {

    double radius;

    public Circle(double radius, double pi) {
        this.radius = radius;


    }
    public String getShapeName() {
        return "Triangle";
    }

    public double getShapeArea() {
        return Math.PI*radius*radius;
    }


}

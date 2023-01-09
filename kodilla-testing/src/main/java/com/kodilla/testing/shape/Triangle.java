package com.kodilla.testing.shape;

public class Triangle implements Shape {


    double sideA, sideB;

    public Triangle( double sideA, double sideB ) {
        this.sideA = sideA;
        this.sideB = sideB;


    }
    public String getShapeName() {
        return "Triangle";
    }

    public double getShapeArea() {
        return (sideA * sideB)*.5;
    }


}

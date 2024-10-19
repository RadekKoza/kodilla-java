package com.kodilla.testing.shape;

public class Square implements Shape {

    private String shapeName;
    private double shapeArea;

    public Square(String shapeName, double shapeArea) {
        this.shapeName = shapeName;
        this.shapeArea = shapeArea;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return shapeArea;
    }
}

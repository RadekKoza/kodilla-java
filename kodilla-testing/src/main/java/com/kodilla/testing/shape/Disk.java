package com.kodilla.testing.shape;
import java.util.Objects;

public class Disk implements Shape {

    private String shapeName;
    private double shapeArea;

    public Disk(String shapeName, double shapeArea) {
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

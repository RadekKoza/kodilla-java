package com.kodilla.testing.shape;
import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public ShapeCollector(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
        System.out.println("added " + shape.getShapeName());
    }

    public boolean removeFigure(Shape shape) {
        if (shapes.remove(shape)) {
            System.out.println(shape.getShapeName() + " removed");
            return true;
        } else {
            System.out.println(shape.getShapeName() + " removal failed");
            return false;
        }
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public String showFigures() {
        String shapesString = "";
        for (Shape shape : shapes) {
            shapesString += shape.getShapeName() + " ";
        }
            return shapesString;
    }
}

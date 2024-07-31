package FactoryPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(shapeFactory.getShape("Circle"));
        shapeList.add(shapeFactory.getShape("Rectangle"));
        shapeList.add(shapeFactory.getShape("Square"));
        for (Shape shape : shapeList) {
            shape.draw();
        }
    }
}

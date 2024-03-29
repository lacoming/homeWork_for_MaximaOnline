package Geometry;

import Geometry.geometrypackage.*;

public class Main {
    public static void main(String[] args) {
        double cumulativeArea = 0;
        for (Shape shape : generateShapes()) {
            System.out.println(shape.getArea());
            cumulativeArea += shape.getArea();
        }
        System.out.println(cumulativeArea);
    }
    private static Shape[] generateShapes() {
        Shape[] shapes = new Shape[15]; // 25

        for (int i = 0; i < (shapes.length / 3); ++i) {
            shapes[i] = new Circle(5.5 + i);
        }
        for (int i = (shapes.length / 3); i < 2 * (shapes.length / 3); ++i) {
            shapes[i] = new Square(6.2 + i);
        }
        for (int i = 2 * (shapes.length / 3); i < shapes.length; ++i) {
            shapes[i] = new Rectangle(3.3 + i, 4.4 + i);
        }
        for (int i = shapes.length / 2; i < shapes.length; i++) {
            shapes[i] = new Tetrahedron(2.3 + Math.sqrt(i));
        }
        for (int i = shapes.length - 1; i < shapes.length; i++) {
            shapes[i] = new Melon();
        }
        return shapes;
    }
}



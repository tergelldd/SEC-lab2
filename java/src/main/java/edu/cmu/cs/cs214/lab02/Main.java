package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Rectangle(2, 3),
            new Circle(2),
            new Square(4)
        };

        for (Shape shape : shapes) {
            Renderer renderer = new Renderer(shape);
            renderer.draw();
        }
    }
}

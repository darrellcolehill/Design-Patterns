package Decorator.decorators;

import Decorator.shapes.Shape;

public class RedShapeDecorator extends ShapeDecorator {
    
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override public void draw() {
        this.decoratedShape.draw();
        System.out.println("Filling shape with red color");
    }
}

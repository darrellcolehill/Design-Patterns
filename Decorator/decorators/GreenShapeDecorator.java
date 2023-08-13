package Decorator.decorators;

import Decorator.shapes.Shape;

public class GreenShapeDecorator extends ShapeDecorator{
    
    public GreenShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override public void draw() {
        this.decoratedShape.draw();
        System.out.println("Adding green color to shape");
    }
}

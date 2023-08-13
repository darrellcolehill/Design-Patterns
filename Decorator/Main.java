package Decorator;

import Decorator.decorators.GreenShapeDecorator;
import Decorator.decorators.RedShapeDecorator;
import Decorator.shapes.Circle;
import Decorator.shapes.Shape;
import Decorator.shapes.Star;

public class Main {
    public static void main(String args[]) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(circle);

        Shape redGreenCircle = new GreenShapeDecorator(redCircle);

        Shape undecisiveColorCircle = new RedShapeDecorator(redGreenCircle);

        System.out.println("=====drawing generic circle=====");
        circle.draw();
        System.out.println("\n=====drawing red circle=====");
        redCircle.draw();
        System.out.println("\n=====drawing red/green circle=====");
        redGreenCircle.draw();
        System.out.println("\n=====drawing undecisive color circle=====");
        undecisiveColorCircle.draw();

        Shape star = new Star();
        System.out.println("\n\n=====drawing generic star=====");
        star.draw();
        System.out.println("\n=====drawing red star=====");
        Shape redStar = new RedShapeDecorator(star);
        redStar.draw();
    }
}

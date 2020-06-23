package telran.controller;

import telran.data.*;

public class ShapeApp {

    public static void main(String[] args) {

        Circle c1 = new Circle(Color.BLACK, 12);
        Circle c2 = new Circle(Color.GREEN, 5);

        Square sq1 = new Square(Color.YELLOW, 6);
        Square sq2 = new Square(Color.RED, 9);

        Rectangle r1 = new Rectangle(Color.YELLOW, 10, 3);
        Rectangle r2 = new Rectangle(Color.BLACK, 1, 5);

        RightTriangle tr = new RightTriangle(Color.YELLOW, 5, 7);
        Triangle tr1 = new RightTriangle(Color.BLACK, 6, 8);
        Shape tr2 = new EquilateralTriangle(Color.RED, 7);


        Shape[] shapes = {c1, c2, sq1, sq2, r1, r2, tr, tr1, tr2};
        Shape sh = new Square(Color.YELLOW, 7);

        System.out.println(tr.getArea());
        System.out.println(tr1.getArea());
        System.out.println(tr2.getArea());

        sh = (Square)sh;

        //sh.getMaxArea(shapes);

        //sh.displayFigures(shapes);

        //System.out.println(sh.getIndexOfFigureByColor(shapes, Color.YELLOW));

        //sh.findFigureByColor2(shapes, Color.YELLOW);

        Shape[] shapesByClass = Shape.findShapesByClass(shapes, "Triangle");
        printArray(shapesByClass);

    }

    private static void printArray(Object[] objects){
        for (Object o : objects) {
            System.out.println(o);
        }
    }

}

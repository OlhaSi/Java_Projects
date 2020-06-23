package telran.data;

public abstract class Shape {

    private Color color;

    public Shape (Color color){
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape: ";
    }

    public abstract double getArea();

    // home work

    public double getMaxArea(Shape[] shapes){
        double areaMax = shapes[0].getArea();
        for (int i = 0; i < shapes.length; i++) {
            if(areaMax < shapes[i].getArea()){
                areaMax = shapes[i].getArea();
            }
        }
        System.out.println("The largest area among figures is: " + areaMax);
        return areaMax;
    }

    public static Shape findMaxFigureArea(Shape[] shapes){
        Shape max = shapes[0];
        double maxArea = max.getArea();
        for (Shape s:shapes) {
            double area = s.getArea();
            if(area > maxArea){
                maxArea = area;
                max = s;
            }
        }
        return max;
    }

    public static Shape findShapeMax (Shape[] shapes){
        int index = 0;
        for (int i = 0; i < shapes.length-1; i++) {
            if(shapes[i].getArea() < shapes[i+1].getArea()){
                index = i+1;
            }
        }
        return shapes[index];
    }

    public void findFigureByColor(Shape[] shapes, Color color){
        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i].getColor().equals(color)){
                System.out.println(shapes[i]);
            }
        }
    }

    public static int numberShapeByColor(Shape[]shapes, Color color){
        int count = 0;
        for (Shape s : shapes) {
            if(s.getColor() == color)
                count++;
        }
        return count;
    }

    public static Shape[] findShapebyColor(Shape[] shapes, Color color){
        Shape[] shapeByColor = new Shape[numberShapeByColor(shapes, color)];
        int index = 0;
        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i].getColor() == color){
                shapeByColor[index] = shapes[i];
                index++;
            }
        }
        return shapeByColor;
    }

    public Shape[] findFigureByColor2(Shape[] shapes, Color color){
        Shape[] figures = new Shape[shapes.length];
        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i].getColor().equals(color)){
                figures[i] = shapes[i];
                System.out.println(shapes[i]);
            }
        }
        return figures;
    }

    public static int numberShapeByClass(Shape[]shapes, String className){
        int count = 0;
        for (Shape s : shapes) {
            if(s.getClass().getSimpleName().equals(className)) {
                count++;
            }
        }
        return count;
    }

    public static Shape[] findShapesByClass(Shape[] shapes, String className){
        Shape[] shapeByClass = new Shape[numberShapeByClass(shapes, className)];
        int index = 0;
        for (Shape s : shapes) {
            if(s.getClass().getSimpleName().equalsIgnoreCase(className)){
                shapeByClass[index] = s;
                index++;
            }
        }
        return shapeByClass;
    }

    public void displayFigures(Shape[] shapes){
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }
    }





//    public void findFigureByColor(Shape[] shapes, Color color){
//        int index = getIndexOfFigureByColor(shapes,color);
//        if(index < 0){
//            System.out.println("Figure is not found ");
//        }else {
//            System.out.println("Figure with " + color + " is found ");
//            shapes[index].displayFigures(shapes);
//        }
//    }
//
//    public int getIndexOfFigureByColor(Shape[] shapes, Color color){
//        int index = 0;
//        for (int i = 0; i < shapes.length; i++) {
//            if(shapes[i].getColor().equals(color)) {
//                index ++;
//            }
//        }
//        return index;
//    }

}

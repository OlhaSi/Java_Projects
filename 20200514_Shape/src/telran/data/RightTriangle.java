package telran.data;

public class RightTriangle extends Triangle {

    private double secondSide;

    public RightTriangle(Color color, double side, double secondSide) {
        super(color, side);
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return (super.getSide() * secondSide) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + "RightTriangle: " +
               super.getColor() + ", side a: " + super.getSide() + ", side b: " + secondSide +
                ", area: " + getArea();
    }
}

package telran.data;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(Color color, double side) {
        super(color, side);
    }

    @Override
    public double getArea() {
        return (Math.pow(super.getSide(), 2) * Math.sqrt(3)) / 4;
    }

    @Override
    public String toString() {
        return super.toString() + "Equilateral triangle: " +
                super.getColor() + ", side: " + super.getSide() +
                ", area: " + getArea();
    }
}

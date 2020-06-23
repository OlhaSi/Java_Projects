package telran.data;

public class Car {

    private String brand;
    private int yearOfProduction;

    public Car(String brand, int yearOfProduction) {
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
    }

    public void start(){
        Headlight light = new Headlight();
        light.turnOn();
        SteeringWheel wheel = new SteeringWheel();
        System.out.println("Car is moving");
        wheel.right();
        wheel.left();
    }

    public class SteeringWheel{
        public void right(){
            System.out.println(brand + " turn right");
        }

        public void left(){
            System.out.println(brand + " turn left");
        }
    }

    public class Headlight{
        public void turnOn(){
            System.out.println("Headlight is on");
        }

        public void turnOff(){
            System.out.println("Headlight is off");
        }
    }
}

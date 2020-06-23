package telran.controller;

import telran.data.Car;

public class CarApp {

    public static void main(String[] args) {
        Car car = new Car("BMW", 2020);
//        Car.SteeringWheel wheel = car.new SteeringWheel();
//        Car.Headlight light = car.new Headlight();

        car.start();
    }
}

package telran.cars.controller;

import telran.cars.entity.Car;
import telran.cars.dao.Garage;

import java.util.Objects;
import java.util.Scanner;

import static telran.cars.entity.Car.getCarFromUser;

public class CarAppl {

    public static void main(String[] args){

        Car c1 = new Car("BMW", "blue", "XS", 2019);
        Car c4 = new Car("BMW", "blue", "XS", 2019);
        Car c2 = new Car("VW", "silver", "Golf", 2015);
        Car c3 = new Car("Audi", "green", "TT", 2010);
        Car c5 = new Car("Audi", "green", "TT", 2010);

        Garage g1 = new Garage(5);
        g1.addCar(c1);
        g1.addCar(c4);
        g1.addCar(c2);
        g1.addCar(c2);
        g1.addCar(c3);
        g1.addCar(c1);
        g1.addCar(c3);
        g1.addCar(c5);

        Car[] carsByColor = g1.ArrayCarsByColor("blue");
        displayArray(carsByColor);

        System.out.println("__________________");

        Car[] carsByBrand = g1.getArrayCarsByBrand("BMW");
        displayArray(carsByBrand);
        System.out.println("______________");

        g1.getSortedCarsbyYear();
        g1.display();

        System.out.println("******************");

        g1.getSortedCarsbyBrand();
        g1.display();
        System.out.println();


       // g1.removeCar(c1);
        g1.removeCar(c2);

//        g1.display();
//        Car.setWheel(5);
//        System.out.println();
//        g1.display();
//
//        System.out.println("*******************");
//
//        g1.oldestCar();
//
//        System.out.println((g1.findCarByModel("Golf") != null) ? g1.findCarByModel("Golf").toString(): "Not found");
//
//        System.out.println(g1.numberOfSameBrand("BMW"));
//
//        System.out.println(c1.compareToCar(c2));

//        System.out.println(c5);
//        g1.paintCar(c5, "black");
//        System.out.println();
//        System.out.println(c5);

//        System.out.println();
//        Scanner scanner = new Scanner(System.in);
//        Car userCar = getCarFromUser(scanner);
//        System.out.println(userCar);
//        g1.addCar(getCarFromUser(scanner));
//        g1.display();


//        scanner.close();

    }

    public static void displayArray(Object[] objects){
        for (Object o: objects) {
            System.out.println(o);
        }
    }
}

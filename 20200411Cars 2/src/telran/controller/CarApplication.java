package telran.controller;

import telran.entity.Car;
import telran.dao.Garage;

import java.util.Scanner;

import static telran.entity.Car.getCarFromUser;

public class CarApplication {
    public static void main(String[] args) {
        Car c1 = new Car("Volkswagen","Tiguan","green",2017);
        Car c2 = new Car("Porsche","Panamera","black", 2018);
        Car c3 = new Car("Audi", "TT","white",2015);
        Car c4 = new Car("Moseratti","Quatroporte","blue",2016);
        Car c5 = new Car("Renoult","Clio","white",2018);
        Car c6 = new Car("Renoult","Megan","yeloow",2012);


        Garage g1 = new Garage(7);
        g1.addCar(c1);
        g1.addCar(c2);
        g1.addCar(c3);
        g1.addCar(c4);
        g1.addCar(c5);
        g1.addCar(c6);

        System.out.println(c1.compareToCar(c2));


        /*System.out.println(c6);
        g1.paintCar(c6, "black");
        System.out.println();
        System.out.println(c6);

        System.out.println();*/
        Scanner scanner = new Scanner(System.in);
        Car userCar = getCarFromUser(scanner);
        System.out.println(userCar);
       /* g1.addCar(getCarFromUser(scanner));
        g1.display();*/


        scanner.close();

        //g1.display();








    }


}

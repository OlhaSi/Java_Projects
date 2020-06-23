package telran.controller;

import telran.entity.Car;
import telran.dao.Garage;

public class CarApplication {
    public static void main(String[] args) {
        Car c1 = new Car("Volkswagen","Tiguan","green",2017);
        Car c2 = new Car("Porsche","Panamera","black", 2018);
        Car c3 = new Car("Audi", "TT","white",2015);
        Car c4 = new Car("Moseratti","Quatroporte","blue",2016);
        Car c5 = new Car("Renoult","Clio","white",2018);



        Garage g1 = new Garage(7);
        g1.addCar(c1);
        g1.addCar(c2);
        g1.addCar(c3);
        g1.addCar(c4);
        g1.addCar(c5);

        System.out.println((g1.findCarByModel("Clio1")!= null)? g1.findCarByModel("Clio1") : "Not found");

        System.out.println(c1);

        System.out.println();

        /*g1.display();

        g1.removeCar(new Car ("Volkswagen","Tiguan","green",2017 ));
        g1.display();

        g1.addCar(c5);
        g1.display();*/

        Car[] cars = g1.getCars();
        System.out.println(cars[0].equals(c1));






    }


}

package telran.controller;

import telran.data.Building;
import telran.data.Cafe;
import telran.data.Cinema;
import telran.data.Kino;

public class Main {

    public static void main(String[] args) {
        Building.House house = new Building.House("Alexstr, 9");
        System.out.println(house.getType());

        Building.Cafe cafe = new Building.Cafe("Friends");
        Cafe cafe1 = new Cafe("Olive");

        Cinema cinema = new Cinema("Imax");
        Cinema.Address add = cinema.new Address ("jbj", 3);
        cinema.setAddress(add);
        //System.out.println(cinema.getAddress());
        cinema.setAddress(cinema.new Address ("Bahnhofstr", 5));
        //System.out.println(cinema.getAddress());

        Cinema cinema1 = new Cinema("SineStar"){
            @Override
            public String toString(){
                return "Noname class method";
            }
        };
        System.out.println(cinema);
        System.out.println(cinema1);

        Kino kino = new Kino("kkklj", "street", 2);
        Kino.AddressContainer a = kino.getAddressContainer();
        System.out.println(a.getHouse());
    }
}

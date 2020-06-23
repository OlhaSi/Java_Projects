package telran.controller;

import telran.data.*;

public class AnimalApp {
    public static void main(String[] args) {
        Object animal1 = new Animal("Tiger", 5, "black-orange");
        Animal animal2 = new Animal("Elephant", 10, "grey");
        Animal animal3 = new WildAnimal("Monkey", 3, "black", "jungle", 200000);
        WildAnimal deer = new WildAnimal("Deer", 8, "brown", "forest", 10000);

        Animal animal4 = new DomesticAnimal( "Hamster", 2, "gold-brown", "Pushistik", "Masha");
        DomesticAnimal pet = new DomesticAnimal( "Rabbit", 4, "white", "Zayka", "Misha");
        DomesticAnimal dog = new Dog( "Dog", 6, "white-black", "Bobik", "Ira");
        Cat cat = new Cat( "Cat", 7, "grey", "Murka", "Katia");

        animal4 = (DomesticAnimal)animal4;
        ((DomesticAnimal) animal4).voice();

        dog.voice();
        dog = (Dog)dog;
        ((Dog) dog).sleep();

        pet = (Dog)pet;
        ((Dog) dog).sleep();

//        animal1 = (Animal)animal1;
//
//        ((Animal) animal1).run();
//        animal2.run();
//        animal3.run();
//        deer.run();
//        ((WildAnimal)animal3).migration();
    }
}

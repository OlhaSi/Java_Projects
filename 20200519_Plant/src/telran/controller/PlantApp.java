package telran.controller;

import telran.data.Flower;
import telran.data.Plant;
import telran.data.Tree;

public class PlantApp {

    public static void main(String[] args) {

        Flower flower1 = new Flower("Tulip", 20, 3);
        Flower flower2 = new Flower("Rose", 0, 0);

        Tree tree1 = new Tree("Citron", 100, 5);
        Tree tree2 = new Tree("Mandarin", 50, 1);

        Plant[] plants = {tree1, flower1};
        displayArray(plants);

        growPlantsForNumberOfYear(plants, 5);
        displayArray(plants);

    }

    public static void growPlantsForNumberOfYear(Plant[] plants, int numberOfYears){
        for (int i = 0; i < numberOfYears; i++) {
            for (Plant plant : plants) {
                System.out.println();
                plant.doYear();
            }
            System.out.println("------------------------------");
        }
    }

    public static void displayArray(Object[] objects){
        for (Object o : objects) {
            System.out.println(o);
        }
    }
}

package telran.controller;

import telran.data.CheapComputerBuilder;
import telran.data.Computer;
import telran.data.ComputerBuilder;
import telran.data.Director;

public class Demo {

    public static void main(String[] args) {

        Director director = new Director();

        ComputerBuilder cheapComputerBuilder = new CheapComputerBuilder();
//        computerBuilder.buildDisplay();
//        computerBuilder.buildSystemBlock();
//        computerBuilder.buildManipulators();
        director.setComputerBuilder(cheapComputerBuilder);
        director.buildComputer();
        //Computer computer = director.buildComputer();

        System.out.println(computer);
    }
}

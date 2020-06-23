package telran.service;

import java.util.Scanner;

public class ConsoleInputOutput {

    public int getNumber(String message, Scanner scanner){   //getNumber("Enter number", scanner);
        System.out.println(message);
        return scanner.nextInt();
    }

    public String getString(String message, Scanner scanner){
        System.out.println(message);
        return  scanner.next();
    }

    public void printMessage(String message){
        System.out.println(message);
    }

}

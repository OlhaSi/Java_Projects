package telran;

import java.util.Scanner;

public class Greeting {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        String[] strNames = new String[]{"Vasya", "Petya", "Kolya", "Olya", "Maria"};

        System.out.println("Enter your name, please");
        String name = scanner.nextLine();
        boolean nameFound = false;

        for(int i = 0; i < strNames.length; i++){
            if(strNames[i].equals(name)) {
                nameFound = true;
                break;
            }
        }

        if(nameFound){
            System.out.println("Hello, " + name);
        }else{
            System.out.println("Sorry, we dont know each other " + name);
        }
    }

}

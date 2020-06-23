package telran;

import java.util.Scanner;

import static telran.Calculator.calculation;
import static telran.Dialog.getParameter;
import static telran.Dialog.operationChoice;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /* System.out.println("Enter number, please");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(number);

        System.out.println("Enter your name, please");
        //scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.println("Enter character");
        char c = scanner.next().charAt(0);
        System.out.println(c); */

        double a = getParameter(scanner);
        double b = getParameter(scanner);
        char operation = operationChoice(scanner);

        // Calculator.calculation(a,b,operation);
        calculation (a, b, operation);

        scanner.close();

        // String[] names = {"Vasya", "Petya", ...}
    }


}

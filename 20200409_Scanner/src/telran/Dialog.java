package telran;

import java.util.Scanner;

public class Dialog {

    static double getParameter(Scanner scanner){
        System.out.println("Enter number");
        return scanner.nextDouble();
    }

    public static char operationChoice(Scanner scanner){
        System.out.println("Enter operation symbol");
        char operation = scanner.next().charAt(0);
        while(operation!= '+' && operation!= '-' && operation!= '*' && operation!= '/'){
            System.out.println("Wrong operation, enter new symbol");
            operation = scanner.next().charAt(0);
        }
        return operation;
    }
}

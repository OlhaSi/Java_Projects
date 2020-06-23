package telran.data;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of day");
        int numberOfDay = scanner.nextInt();
        WeeksDay.getDayByOrderly(numberOfDay);

        scanner.close();
    }
}

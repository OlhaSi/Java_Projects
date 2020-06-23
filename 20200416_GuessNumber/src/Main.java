import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int range = 10;
        int range1 = 20;
        int range2 = 30;
        int number = (int) (Math.random() * range);
        int number1 = (int) (Math.random() * range1);
        int number2 = (int) (Math.random() * range2);

        playMultipleLevels();

//        playLevel(range, number);
//
//        playLevel(range1, number1);
//
//        playLevel(range2, number2);

        System.out.println("Congratulations!!!  ");

        scanner.close();


       /* while(true){
            System.out.println("My number is bigger than 0 but smaller " + range);
            int inputNumber = scanner.nextInt();
            if (inputNumber == number){
                System.out.println("Bingo!!!");
                break;
            }
            else if (inputNumber > number)
                System.out.println("My number is smaller, enter new number");
            else System.out.println("My number is bigger, enter new number");
        }*/
    }

    private static void playLevel(int range, int number) {
        System.out.println("My number is bigger than 0 but smaller " + range);
        while (true) {
            int inputNumber = scanner.nextInt();
            if (inputNumber == number) {
                System.out.println("Bingo!!! Next level. ");
                break;
            } else if (inputNumber > number)
                System.out.println("Your guess is to high, enter new number");
            else System.out.println("Your guess is to low, enter new number");
        }
    }

    private static void playMultipleLevels() {
        int range = 10;
        int number = (int) (Math.random() * range);
        int level = 1;
        System.out.println("My number is bigger than 0 but smaller " + range);
        while (true) {
            int inputNumber = scanner.nextInt();
            if (inputNumber == number) { // right answer
                System.out.println("Bingo!!! Next level. ");
                level++;

                if (level == 4) {
                    break;
                }

                range += 10;
                number = (int) (Math.random() * range);
                System.out.println("My number is bigger than 0 but smaller " + range);

            } // wrong answer
            else if (inputNumber > number)
                System.out.println("Your guess is to high, enter new number");
            else System.out.println("Your guess is to low, enter new number");
        }
    }
}

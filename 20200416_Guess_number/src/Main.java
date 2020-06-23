import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        if(playGame()==40)
            System.out.println("You win!!!");
        else
            System.out.println("Let's play next time!");


        scanner.close();
    }

    private static boolean check(){
        System.out.println("You want to play? y/n");
        char answer = scanner.next().charAt(0);
        return answer == 'y';
    }

    private static int playGame(){
        int i;
        for(i =10; i<=30; i+=10){
            if(check()){
            System.out.print("my number is greater than 0 but less " + i);
            System.out.println(", guess it!");
            playLevel(i);}
            else{
                System.out.println("Good bye!");
                break;
            }
        }
        return i;
    }



    private static void playLevel (int range){
        int number = (int) (Math.random()*range);
        //System.out.println(", guess it!");
        while(true){
            int inputNumber = scanner.nextInt();
            if(inputNumber==number){
                System.out.println("Bingo!!!");
                break;
            }
            else if(inputNumber>number)
                System.out.println("my number is less, enter new number");
            else System.out.println("my number is greater, enter new number");
        }
    }

}

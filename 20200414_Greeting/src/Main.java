import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Kolya", "Vasya", "Katya", "Olya", "Sasha"};
        System.out.println("Enter your name, please");
        String name = scanner.nextLine();
        greetingUser(name, names);

        boolean answear = greeting(name, names);
        /*if(answear){System.out.println("Hell " + name);
        }
        else{System.out.println("I don't know you");}*/
        System.out.println((answear)? "Hello " + name: "I don't know you");

        scanner.close();


    }

    public static boolean greeting(String name, String[] names) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public static void greetingUser(String name, String[] names){
        boolean flag = false;
        for (int i = 0; i <names.length ; i++) {
            if(names[i].equalsIgnoreCase(name)) {
                flag = true;
            }

        }
        /*if(flag){
            System.out.println("Hello " + name);

        }else{
            System.out.println("I don't know you");
        }*/
        System.out.println((flag)? "Hello " + name: "I don't know you");

    }
}

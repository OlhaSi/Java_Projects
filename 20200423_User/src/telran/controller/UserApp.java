package telran.controller;

import telran.data.User;

import java.util.Scanner;

public class UserApp {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        User user1 = new User("Gena", 3467);
        User user2 = new User("Luisa", 2234);
        User user3 = new User("Martin", 1123);
        User user4 = new User("Jon", 4567);
        User user5 = new User("Mariya", 3535);

        User[] users = {user1, user2, user3, user4, user5};
        String userName = getNameFromUser();
        userCollaboration(users, userName);

        scanner.close();


    }

    private static String getNameFromUser() {
        System.out.println("Enter your name, please");
        return scanner.nextLine();
    }

    private static int operationChoice() {
        System.out.println("if you want get your secret code, enter 1");
        System.out.println("if you want change your name, enter 2");
        return scanner.nextInt();
    }

    private static void makeUserOperationChoice(int operation, User user) {
        switch (operation) {
            case 1:
                System.out.println(user.getSecretCode());
                break;
            case 2:
                updateUser(user);
                break;
            default:
                System.out.println("wrong operation number");
        }

    }

    private static void updateUser(User user) {
        System.out.println("Enter your secret code, please");
        int secretCode = scanner.nextInt();
        if (user.checkSecretCode(secretCode)) {
            System.out.println("Enter your new name");
            user.setName(scanner.next());
            System.out.println("Your name is " + user.getName() + " now");
        } else {
            System.out.println("sorry, secret code is wrong");
        }
    }

    private static void userCollaboration(User[] users, String name) {
        User user = User.getUserByName(users, name);
        if (user != null) {
            System.out.println("Hallo dear " + user.getName() + "!");
            int operation = operationChoice();
            makeUserOperationChoice(operation, user);
        } else {
            System.out.println("sorry, we don't know you");
        }
    }


}

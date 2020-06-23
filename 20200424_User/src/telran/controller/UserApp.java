package telran.controller;

import telran.dao.UsersGroup;
import telran.data.User;
import telran.service.ConsoleInputOutput;
import telran.service.UserSession;

import java.util.Scanner;

public class UserApp {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UsersGroup usersGroup = new UsersGroup(10);
        usersGroup.addUser(new User("Gena", 3467));
        usersGroup.addUser(new User("Luisa", 2234));
        usersGroup.addUser(new User("Martin", 1123));
        usersGroup.addUser(new User("Jon", 4567));
        usersGroup.addUser(new User("Mariya", 3535));

        Scanner scanner = new Scanner(System.in);

        ConsoleInputOutput inputOutput = new ConsoleInputOutput();

        UserSession userSession = new UserSession(usersGroup, scanner, inputOutput);
        userSession.makeSession();


        scanner.close();


    }

}

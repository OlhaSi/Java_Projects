package telran.controller;

import telran.data.Command;
import telran.data.DuckHunting;
import telran.data.Football;
import telran.data.Hockey;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class GameApp {

    public static void main(String[] args) {

        Map<Integer, Command> gamesMap = new HashMap<>();

        Football football = new Football();

        gamesMap.put(football.getNumber(), football);
        //gamesMap.put(1, new Football());    - it's the same
        gamesMap.put(2, new Hockey());
        gamesMap.put(3, new DuckHunting());

        System.out.println("Choice game, enter number");
        System.out.println("1 - football, 2 - hockey, 3 - duck hunting");
        game(gamesMap);
    }

    public static void game(Map<Integer, Command> gameMap){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        if(number > 0 && number < 4){
            gameMap.get(number).execute();
        } else
            System.out.println("Wrong number");
        scanner.close();
    }
}

package telran.service;

import telran.dao.UsersGroup;
import telran.data.User;

import java.util.Scanner;

public class UserSession {
    private UsersGroup usersGroup;
    private Scanner scanner;
    private ConsoleInputOutput inputOutput;

    public UserSession(UsersGroup usersGroup, Scanner scanner, ConsoleInputOutput inputOutput) {
        this.usersGroup = usersGroup;
        this.scanner = scanner;
        this.inputOutput = inputOutput;
    }

    public void makeSession(){
        String name = inputOutput.getString("Enter your name", scanner);
        User user = usersGroup.getUserByName(name);
        if(user!=null){
            inputOutput.printMessage("Hallo dear " + user.getName() + "!");
            int operation = inputOutput.getNumber("to get secret code type 1\nto change name type 2", scanner);
            user.makeUserOperationChoice(operation,scanner,inputOutput);
        }else{
            inputOutput.printMessage("sorry, we don't know you");
        }
    }

}

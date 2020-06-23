package telran.data;

import telran.service.ConsoleInputOutput;

import java.util.Objects;
import java.util.Scanner;

public class User {
    private String name;
    private int secretCode;

    public User(String name, int secretCode) {
        this.name = name;
        this.secretCode = secretCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSecretCode() {
        return secretCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return secretCode == user.secretCode &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secretCode);
    }

    public boolean checkSecretCode(int number){
        return secretCode == number;
    }

    @Override
    public String toString() {
        return "\nUser: " +
                name + ", secretCode: " + secretCode;
    }

    private void updateUser(Scanner scanner, ConsoleInputOutput inputOutput){
        int secretCode = inputOutput.getNumber("Enter your secret code, please", scanner);
        if(checkSecretCode(secretCode)){
            setName(inputOutput.getString("Enter your new name", scanner));
            inputOutput.printMessage("Your name is " + getName() + " now");
        }else{
            inputOutput.printMessage("sorry, secret code is wrong");
        }
    }

    public void makeUserOperationChoice(int operation, Scanner scanner, ConsoleInputOutput inputOutput ){
        switch (operation){
            case 1:
                System.out.println(getSecretCode());
                break;
            case 2:
                updateUser(scanner, inputOutput);
                break;
            default:
                inputOutput.printMessage("wrong operation number");
        }

    }

}

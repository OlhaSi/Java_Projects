import java.util.Scanner;

public class Game {

    private int attempts;
    private int secret;

    private GameMessenger gameMessenger;
    private GameNumberReader gameNumberReader;

    public Game(int attempts, int secret, GameMessenger gameMessenger, GameNumberReader gameNumberReader) {
        this.attempts = attempts;
        this.secret = secret;
        this.gameMessenger = gameMessenger;
        this.gameNumberReader = gameNumberReader;
    }

    public void play(){
        greetingMessage();
        boolean guess = guess();
        showGameOver(guess);
    }

    private void showGameOver(boolean guessCorrectly){
        if(guessCorrectly){
            congratsMessage();
        }else {
            loseMessage();
        }
    }

    private boolean guess(){
        boolean guessedCorrectly = false;
        while (!guessedCorrectly && attempts > 0){
            int guessNumber = gameNumberReader.getGuessNumber();
            if(guessNumber == secret){
                guessedCorrectly = true;
            }else{
                tryAgainMessage();
                attempts --;
            }
        }
        return guessedCorrectly;
    }


    private void greetingMessage(){
        gameMessenger .print("Hello! Enter your number");
    }

    private void congratsMessage(){
        gameMessenger.print("You won!");
    }

    private void loseMessage(){
        gameMessenger.print("You lose");
    }

    private void tryAgainMessage(){
        gameMessenger.print("Wrong number, try again");
    }
}



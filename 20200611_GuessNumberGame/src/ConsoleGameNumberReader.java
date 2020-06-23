import java.util.Scanner;

public class ConsoleGameNumberReader implements GameNumberReader {

    Scanner scanner = new Scanner(System.in);

    @Override
    public int getGuessNumber() {
        return scanner.nextInt();
    }
}

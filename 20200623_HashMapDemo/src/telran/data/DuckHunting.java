package telran.data;

public class DuckHunting implements Command {

    private final int number = 3;

    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        System.out.println("Shooting begins");
    }
}

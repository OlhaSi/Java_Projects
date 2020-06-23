package telran.data;

public class Hockey implements Command {

    private final int number = 2;

    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        System.out.println("Hockey starts");
    }
}

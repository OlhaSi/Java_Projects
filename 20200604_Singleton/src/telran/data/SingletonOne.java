package telran.data;

public class SingletonOne {

    public static final SingletonOne INSTANCE = new SingletonOne();
    private static final String NAME = "BOSS";

    private SingletonOne() {
    }

    public String getNAME() {
        return NAME;
    }
}

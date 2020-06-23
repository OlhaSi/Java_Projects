package telran.data;

public class Singleton {

    private Singleton(){

    }
    private static String name = "Boss";

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}

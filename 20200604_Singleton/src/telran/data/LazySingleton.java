package telran.data;

public class LazySingleton {

    private static LazySingleton INSTANCE;
    private String name;

    private LazySingleton() {
    }

    public static LazySingleton getInstance(String str){
        if (INSTANCE == null){
            INSTANCE = new LazySingleton();
            INSTANCE.name = str;
        }
        return INSTANCE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

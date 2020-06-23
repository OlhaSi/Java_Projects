package telran.data;

public interface Printable {

    void print();

    default void print2(){
        System.out.println("Undefine");
    }

    static void print1(){
        System.out.println("Reading is good");
    }

    static Printable createObject(String name, int choice){
        switch (choice){
            case 1: return new Book(name);
            case 2 : return new Magazine(name);
            case 3: return new Newspaper();
            default: return null;
        }
    }
}

package telran.data;

public class WaterPipe implements Printable, Statable {
    @Override
    public void print() {
        System.out.println("I'm pipe");
    }

    @Override
    public void printState(int n) {
        if(n == OPEN){
            System.out.println("Water is opened");
        }else if (n == CLOSED){
            System.out.println("Water is closed");
        } else
            System.out.println("It's broken");
    }
}

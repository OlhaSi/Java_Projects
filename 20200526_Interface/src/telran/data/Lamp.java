package telran.data;

public class Lamp implements Statable {
    @Override
    public void printState(int n) {
        if(n == OPEN){
            System.out.println("Light is on");
        } else if(n == CLOSED){
            System.out.println("Light is off");
        } else
            System.out.println("Lamp is broken");
    }

}

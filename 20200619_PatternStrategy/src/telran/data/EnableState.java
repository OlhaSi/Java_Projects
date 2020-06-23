package telran.data;

public class EnableState implements GadgetState {
    @Override
    public void doAction() {
        System.out.println("I'm on");
    }
}

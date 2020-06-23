package telran.data;

public class DisabledState implements GadgetState {
    @Override
    public void doAction() {
        System.out.println("I'm off");
    }
}

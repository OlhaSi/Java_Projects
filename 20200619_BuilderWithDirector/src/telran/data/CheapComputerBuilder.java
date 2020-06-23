package telran.data;

public class CheapComputerBuilder extends ComputerBuilder {

    @Override
    public void buildSystemBlock() {
        computer.setSystemBlock("Windows 10");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("Cor5");
    }

    @Override
    public void buildManipulators() {
        computer.setManipulators("Mouse and keyboard");
    }
}

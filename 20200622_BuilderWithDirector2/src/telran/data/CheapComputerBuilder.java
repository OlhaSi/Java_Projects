package telran.data;

public class CheapComputerBuilder extends Computer implements ComputerBuilder{

    private Computer computer;

    public Computer getComputer() {
        return computer;
    }


    @Override
    public void buildSystemBlock() {
        setSystemBlock("Windows 11");
    }

    @Override
    public CheapComputerBuilder buildDisplay() {
        setDisplay("Cor5");
        return null;
    }

    @Override
    public void buildManipulators() {
        setManipulators("Mouse and keyboard");
    }
}

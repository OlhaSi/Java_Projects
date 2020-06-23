package telran.data;

public interface ComputerBuilder {
    

//    public Computer getComputer() {
//        return computer;
//    }
//
//    public ComputerBuilder(){
//        computer = new Computer();
//    }

    public void buildSystemBlock();

    public CheapComputerBuilder buildDisplay();

    public void buildManipulators();

    Computer getComputer();
}

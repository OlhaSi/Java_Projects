package telran.data;

public class Director {

    private ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer getComputer() {
        return computerBuilder.getComputer();
    }

    public void buildComputer(){
        computerBuilder.computer = new Computer();
        computerBuilder.buildDisplay();
        computerBuilder.buildSystemBlock();
        computerBuilder.buildManipulators();
    }
}

package telran.data;

public class DomesticAnimal extends Animal {
    private String nickName;
    private String ownerName;

    public DomesticAnimal(String animalName, int age, String color, String nickName, String ownerName) {
        super(animalName, age, color);
        this.nickName = nickName;
        this.ownerName = ownerName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public String toString() {
        return "DomesticAnimal: " + super.toString() +
                "nickName: " + nickName +
                ", ownerName: " + ownerName;
    }

    public void play(){
        System.out.println(nickName + " is playing");
        System.out.println(nickName + " is" + super.getAge() + " years old");
    }

    public void voice(){
        System.out.println(nickName + " says: ");
    }
}

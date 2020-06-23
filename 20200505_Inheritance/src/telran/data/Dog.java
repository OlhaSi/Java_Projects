package telran.data;

public class Dog extends DomesticAnimal {

    public Dog(String animalName, int age, String color, String nickName, String ownerName) {
        super(animalName, age, color, nickName, ownerName);
    }

    @Override
    public void voice(){
        super.voice();
        System.out.print("haw-haw");
    }

    public void sleep(){
        System.out.println(getNickName() + " sleep");
    }
}

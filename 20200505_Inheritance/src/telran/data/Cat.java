package telran.data;

public class Cat extends DomesticAnimal {

    public Cat(String animalName, int age, String color, String nickName, String ownerName) {
        super(animalName, age, color, nickName, ownerName);
    }

    @Override
    public void voice(){
        super.voice();
        System.out.println("meow-meow");
    }
}

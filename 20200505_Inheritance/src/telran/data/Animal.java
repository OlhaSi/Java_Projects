package telran.data;

public class Animal {
    private String animalName;
    private int age;
    private String color;


    public Animal(String animalName, int age, String color) {
        this.animalName = animalName;
        this.age = age;
        this.color = color;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return animalName +
                ", age: " + age +
                ", color: " + color;
    }

    public void run(){
        System.out.println(animalName + " run");
    }
}

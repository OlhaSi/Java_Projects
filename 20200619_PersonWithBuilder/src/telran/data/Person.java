package telran.data;

import java.util.List;

public class Person {

    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;
    private List<Person> parents;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public List<Person> getParents() {
        return parents;
    }

    public static class Builder{
        private Person newPerson;

        public Builder() {
            this.newPerson = new Person();
        }

        public Builder personWithName(String name){
            newPerson.name = name;
            return this;
        }

        public Builder personWithSurname(String surname){
            newPerson.surname = surname;
            return this;
        }

        public Builder personWithAge(int age){
            newPerson.age = age;
            return this;
        }

        public Builder personWitHeight(int height){
            newPerson.height = height;
            return this;
        }

        public Builder personWithWeight(int weight){
            newPerson.weight = weight;
            return this;
        }

        public Builder personWithParents(List<Person> parents){
            newPerson.parents = parents;
            return this;
        }

        public Person build(){
            return newPerson;
        }
    }
}

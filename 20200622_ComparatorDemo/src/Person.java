public class Person implements Comparable<Person>{

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name: " + name +
                ", " + age;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }

//    @Override
//    public int compareTo(Person o){
//        if(this.age > o.age)
//            return 1;
//        else if(this.age < o.age)
//            return -1;
//        return 0;
//    }
}

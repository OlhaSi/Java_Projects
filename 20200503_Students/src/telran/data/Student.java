package telran.data;

import java.util.Objects;

public class Student {

    private String name;
    private Sex gender;
    private int age;

    public Student(String name, Sex gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() &&
                getName().equals(student.getName()) &&
                getGender().equals(student.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getGender(), getAge());
    }

    @Override
    public String toString() {
        return "Student: " + name
                 + ", " + gender
                + ", " + age;
    }
}


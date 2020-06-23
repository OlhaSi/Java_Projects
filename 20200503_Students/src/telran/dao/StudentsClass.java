package telran.dao;

import telran.data.Sex;
import telran.data.Student;

import java.util.Arrays;

public class StudentsClass {

    private Student[] students;
    private int size;

    public StudentsClass(int capacity) {
        students = new Student[capacity];
        size = 0;
    }

    public boolean addStudent(Student student) {
        if (size < students.length) {
            students[size] = student;
            size++;
            return true;
        }
        return false;
    }

    public boolean removeStudent(Student student) {
        for (int i = 0; i < size; i++) {
            if (students[i].equals(student)) {
                students[i] = students[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    public int youngestStudent() {
        int youngest = students[0].getAge();
        for (int i = 0; i < size; i++) {
            if (youngest > students[i].getAge()) {
                youngest = students[i].getAge();
            }
        }
        System.out.println("Student with the age " + youngest + " is the youngest");
        return youngest;
    }

    public void numberOfBoys(Sex gender){
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if(students[i].getGender().equals(gender))
                counter++;
        }
        String sex = gender == Sex.MALE ? "boys" : "girls";
        System.out.println("There are " + counter + " " + sex +" in the class");
    }

    public void printStudents(){
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }


    @Override
    public String toString() {
        return "StudentsClass: " +
                "students: " + Arrays.toString(students) +
                ", size: " + size;
    }
}

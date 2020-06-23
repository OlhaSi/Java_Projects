package telran.controller;

import telran.dao.StudentsClass;
import telran.data.Sex;
import telran.data.Student;

public class StudentApp {

    public static void main(String[] args) {

        Student student1 = new Student("Dan", Sex.MALE, 20);
        Student student2 = new Student("Maria", Sex.FEMALE, 18);
        Student student3 = new Student("Anna", Sex.FEMALE, 19);
        Student student4 = new Student("Andy", Sex.MALE, 17);
        Student student5 = new Student("Peter", Sex.MALE, 18);

        Student[] students = {student1, student2, student3};

        StudentsClass sc1 = new StudentsClass(10);
        sc1.addStudent(student1);
        sc1.addStudent(student2);
        sc1.addStudent(student3);
        sc1.addStudent(student4);
        sc1.addStudent(student5);
        sc1.addStudent(student1);
        sc1.addStudent(student3);
        sc1.addStudent(student2);

        sc1.removeStudent(student1);

        sc1.youngestStudent();
        sc1.numberOfBoys(Sex.MALE);
        sc1.numberOfBoys(Sex.FEMALE);

        sc1.printStudents();

    }
}

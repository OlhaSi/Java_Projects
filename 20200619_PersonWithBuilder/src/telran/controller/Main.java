package telran.controller;

import telran.data.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> parents = new ArrayList<>();
        Person m = new Person.Builder()
                .personWithName("Anna")
                .personWithSurname("Kiefer")
                .build();
        Person f = new Person.Builder()
                .personWithName("Matthias")
                .personWithSurname("Kiefer")
                .build();

        Person p = new Person.Builder()
                .personWithName("Dan")
                .personWithSurname("Kiefer")
                .personWithAge(15)
                .personWitHeight(175)
                .personWithWeight(70)
                .personWithParents(parents)
                .build();
    }
}

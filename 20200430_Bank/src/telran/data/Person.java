package telran.data;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int dateOfBirth;
    private String address;

    public Person(String firstName, String lastName, int dateOfBirth, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getDateOfBirth() == person.getDateOfBirth() &&
                getFirstName().equals(person.getFirstName()) &&
                getLastName().equals(person.getLastName()) &&
                getAddress().equals(person.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getDateOfBirth(), getAddress());
    }

    @Override
    public String toString() {
        return "Client: " + firstName +
                " " + lastName +
                ", dateOfBirth: " + dateOfBirth +
                "\naddress: " + address;
    }

    public String toStringName() {
        return "client: " + firstName +
                " " + lastName;
    }
}

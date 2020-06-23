package telran.dao;

import telran.data.Customer;

import java.util.Arrays;

public class Group {

    private Customer[] group;
    private int size;

    public Group (int capacity){
        group = new Customer[capacity];
        size = 0;
    }

    public boolean addCustomer (Customer customer){
        if(size < group.length){
            group[size] = customer;
            size++;
            return true;
        }
        return false;
    }

    public boolean removeCustomer (String name){
        for (int i = 0; i < size; i++) {
            if(group[i].getName().equalsIgnoreCase(name)){
                group[i] = group[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    public void displayCustomers(){
        for (int i = 0; i < size; i++) {
            System.out.println(group[i]);
        }
    }

    public void displayCustomersNames(){
        for (int i = 0; i < size-1; i++) {
            System.out.print(group[i].getName() + ", ");
        }
        System.out.print(group[size-1].getName());
    }

    @Override
    public String toString() {
        return Arrays.toString(group);
    }
}

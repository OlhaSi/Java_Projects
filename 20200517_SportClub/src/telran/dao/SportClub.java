package telran.dao;

import telran.data.*;

import java.util.Scanner;

public class SportClub {

    private Section[] sections;
    private int size;

    public SportClub(int capacity){
        sections = new Section[capacity];
        size = 0;
    }

    public boolean addSection(Section section){
        if(size < sections.length){
            sections[size] = section;
            size++;
            return true;
        }
        return false;
    }

    public boolean removeSection(String name){
        for (int i = 0; i < size; i++) {
           if(sections[i].getClass().getSimpleName().equalsIgnoreCase(name)){
               sections[i] = sections[size-1];
               size--;
               return true;
           }
        }
        return false;
    }

    public void displaySection(){
        for (int i = 0; i < size; i++) {
            System.out.println(sections[i]);
            System.out.print("classes on: ");
            DayOfWeek.displayDayOfWeek(sections[i].getDays());
            System.out.print("\nin the section: ");
            sections[i].getGroup().displayCustomersNames();
            System.out.println("---------------------------");
        }
    }

    public void displayTrainerNameBySectionName(String name){
        for (int i = 0; i < size; i++) {
            if(sections[i].getClass().getSimpleName().equalsIgnoreCase(name)){
                System.out.println("Trainer name is: " + sections[i].getTrainerName());
                return;
            }
        }
        System.out.println("Section is not found");
    }

    public void displayDayOfClassBySectionName(String sectionName){
        for (int i = 0; i < size; i++) {
            if(sections[i].getClass().getSimpleName().equalsIgnoreCase(sectionName)){
                System.out.print("Classes on: ");
                DayOfWeek.displayDayOfWeek(sections[i].getDays());
                return;
            }
        }
        System.out.println("Section is not found");
    }

    public double getPriceBySectionName(String sectionName){
        for (int i = 0; i < size; i++) {
           if(sections[i].getClass().getSimpleName().equalsIgnoreCase(sectionName)){
               return sections[i].getPricePerHour();
           }
        }
        return -1;
    }

    public void displayCustomerBySection(String sectionName){
        for (int i = 0; i < size; i++) {
            if(sections[i].getClass().getSimpleName().equalsIgnoreCase(sectionName)){
                System.out.println("In section: ");
                sections[i].getGroup().displayCustomersNames();
                return;
            }
        }
        System.out.println("Section is not found");
    }

    public void changeTrainerName(String sectionName, Scanner scanner){
        for (int i = 0; i < size; i++){
            if(sections[i].getClass().getSimpleName().equalsIgnoreCase(sectionName)){
                System.out.println("Name of trainer is: " + sections[i].getTrainerName());
                System.out.println("Type the new name");
                String name = scanner.nextLine();
                sections[i].setTrainerName(name);
                System.out.println("New trainer is: " + sections[i].getTrainerName());
                return;
            }
        }
        System.out.println("Section is not found");
    }

    public double getPriceOfSectionPerMonth(String sectionName){
        for (int i = 0; i < size; i++) {
            if(sections[i].getClass().getSimpleName().equalsIgnoreCase(sectionName)){
                return sections[i].getPricePerMonth();
            }
        }
        return -1;
    }

    public boolean addCustomerToSection (String sectionName, Customer customer){
        for (int i = 0; i < size; i++) {
           if(sections[i].getClass().getSimpleName().equalsIgnoreCase(sectionName)){
               if(sections[i].getGroup().addCustomer(customer)){
               sections[i].getGroup().displayCustomers();
               return true;
               }
           }
        }
        return false;
    }

    public boolean removeCustomerFromSection(String sectionName, String customerName){
        for (int i = 0; i < size; i++) {
            if(sections[i].getClass().getSimpleName().equalsIgnoreCase(sectionName)){
                if(sections[i].getGroup().removeCustomer(customerName)){
                sections[i].getGroup().displayCustomers();
                return true;
                }
            }
        }
        return false;
    }

    public int getCountOfSections(){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(sections[i] instanceof Box){
                count++;
            }
        }
        return count;
    }

    public int getCount(String sectionName){
        int count = 0;
        switch (sectionName){
            case "box":
                for (int i = 0; i < size; i++) {
                    if(sections[i] instanceof Box){
                        count++;
                    }
                }
                break;
            case "football":
                for (int i = 0; i < size; i++) {
                    if(sections[i] instanceof Football){
                        count++;
                    }
                }
                break;
        }
        return count;
    }
}

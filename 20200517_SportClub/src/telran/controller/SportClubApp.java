package telran.controller;

import telran.dao.Group;
import telran.dao.SportClub;
import telran.data.*;

import java.util.Scanner;

public class SportClubApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Customer c1 = new Customer("Dan", 25);
        Customer c2 = new Customer("Pablo", 28);
        Customer c3 = new Customer("George", 30);
        Customer c4 = new Customer("Anna", 22);
        Customer c5 = new Customer("Kate", 24);
        Customer c6 = new Customer("Bony", 24);
        Customer c7 = new Customer("Ola", 24);
        Customer c8 = new Customer("Rick", 24);

        Group tennis = new Group(5);
        tennis.addCustomer(c1);
        tennis.addCustomer(c2);
        tennis.addCustomer(c3);
        tennis.addCustomer(c4);

        Group box = new Group(4);
        box.addCustomer(c5);
        box.addCustomer(c6);
        box.addCustomer(c7);

        Group football = new Group(6);
        football.addCustomer(c8);
        football.addCustomer(c1);
        football.addCustomer(c2);
        football.addCustomer(c3);
        football.addCustomer(c6);
        football.addCustomer(c7);

        //football.displayCustomers();

        DayOfWeek[] footballDays = {DayOfWeek.THURSDAY, DayOfWeek.WEDNESDAY};
        DayOfWeek[] boxDays = {DayOfWeek.SATURDAY, DayOfWeek.MONDAY, DayOfWeek.TUESDAY};
        DayOfWeek[] tennisDays = {DayOfWeek.FRIDAY, DayOfWeek.THURSDAY};

        Section football1 = new Football("Jurgen Klopp", footballDays, football);
        Section tennis1 = new Tennis("Boris Becker", tennisDays, tennis);
        Section box1 = new Box("Leila Ali", boxDays, box);


        SportClub sc = new SportClub(5);
        sc.addSection(box1);
        sc.addSection(football1);
        sc.addSection(tennis1);

       // sc.displaySection();

//        sc.displayTrainerNameBySectionName("box");
//        sc.displayDayOfClassBySectionName("box");

//        double price = sc.getPriceBySectionName("tennis");
//        System.out.println(price > 0 ? "Price per hour: " + price : "Section not found");

       // sc.displayCustomerBySection("box");

//        System.out.println(box1.getPricePerHour());
//        System.out.println(football1.getPricePerHour());
//        System.out.println(tennis1.getPricePerHour());

        //sc.changeTrainerName("box", scanner);
//        double monthPrice = sc.getPriceOfSectionPerMonth("box");
//        System.out.println((monthPrice > 0) ? "Price per month: " + monthPrice : "Section not found");
//
//        scanner.close();


        sc.addCustomerToSection("box", c1);
        sc.removeCustomerFromSection("box", "Dan");

        System.out.println(sc.getCountOfSections());

    }
}

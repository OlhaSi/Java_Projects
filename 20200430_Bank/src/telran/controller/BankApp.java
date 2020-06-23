package telran.controller;

import telran.dao.Bank;
import telran.data.BankAccount;
import telran.data.Person;

public class BankApp {

    public static void main(String[] args) {

        Person client1 = new Person("Matthias", "Kiefer", 1989, "Berlin");
        Person client2 = new Person("Dan", "Andreas", 1980, "Paris");
        Person client3 = new Person("Anna", "Peterson", 1985, "Munich");
        Person client4 = new Person("Kate", "Tang", 1990, "Frankfurt");

        BankAccount account1 = new BankAccount(client1, 500);
        BankAccount account2 = new BankAccount(client2, 1000);
        BankAccount account3 = new BankAccount(client3, 2000);
        BankAccount account4 = new BankAccount(client4, 300);

        Bank deutscheBank = new Bank(100);
        deutscheBank.addAccount(account1);
        deutscheBank.addAccount(account2);
        deutscheBank.addAccount(account3);
        deutscheBank.addAccount(account4);

        System.out.println(deutscheBank.closeAccount(101001));
        deutscheBank.addAccount(account1);
        //deutscheBank.display();

        //System.out.println(deutscheBank.getBankBalance());

        account1.debit(300);
        //System.out.println(account1.getBalance());

        deutscheBank.transferMoney(101001, 101004, 500);

        deutscheBank.findBankAccountByLastName("XXX");
    }
}

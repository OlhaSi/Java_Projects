package telran.dao;

import telran.data.BankAccount;

public class Bank {
    private BankAccount[] accounts;
    int size;

    public Bank(int capacity) {
        accounts = new BankAccount[capacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public int checkAccount(int account) {
        for (int i = 0; i < size; i++) {
            if (account == accounts[i].getAccount()) {
                return i;
            }
        }
        return -1;
    }

    public boolean addAccount(BankAccount account) {
        if (checkAccount(account.getAccount()) >= 0) {
            return false;
        }
        if (size < accounts.length) {
            accounts[size] = account;
            size++;
            return true;
        }
        return false;
    }

//    public boolean addAccount(BankAccount account){
//        if(checkAccount(account.getAccount()) >= 0 || size >= accounts.length){
//            return false;
//        }
//        accounts[size] = account;
//        size ++;
//        return true;
//    }

    public boolean closeAccount(int account) {
        int index = checkAccount(account);
        if (index < 0) {
            return false;
        }
        accounts[index] = accounts[size - 1];
        size--;
        return true;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(accounts[i]);
            System.out.println("-------------------------");
        }
    }

    public BankAccount[] existingAccounts() {
        BankAccount[] allAccounts = new BankAccount[size];
        for (int i = 0; i < size; i++) {
            allAccounts[i] = accounts[i];
        }
        return allAccounts;
    }

    public double getBankBalance() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + accounts[i].getBalance();
        }
        return sum;
    }

    public boolean transferMoney(int accountFrom, int accountTo, double sum) {
        int indexFrom = checkAccount(accountFrom);
        if (indexFrom < 0) {
            System.out.println("Withdrawal account is incorrect, please check and try again");
            return false;
        }
        int indexTo = checkAccount(accountTo);
        if (indexTo < 0) {
            System.out.println("Recipient's account is incorrect, please check and try again");
            return false;
        }
        if (!accounts[indexFrom].credit(sum)) {       //  (!true) == false  (!false) == true
            System.out.println("The transfer is not possible, your balance is to low");
            return false;
        }
        accounts[indexTo].debit(sum);
        System.out.println("your transfer is finished");
        System.out.println("see details below");
        System.out.println("---------------------------");
        System.out.println(sum + " was transferred to " + accounts[indexTo].getClient().toStringName());
        System.out.println("your balance is " + accounts[indexFrom].getBalance());
        return true;
    }

    public void findBankAccountByLastName(String lastName){
        for (int i = 0; i < size; i++) {
            if(accounts[i].getClient().getLastName().equalsIgnoreCase(lastName)){
                System.out.println("We found this account: \n" + accounts[i].toString());
                return;
            }
        } System.out.println("No information about this account");
    }
}

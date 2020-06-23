package telran.data;

import java.util.Objects;

public class BankAccount {
    private int account;
    private Person client;
    private double balance;
    private static int accountNumber = 101000;

    public BankAccount(Person client, double balance) {
        this.account = ++accountNumber;
        this.client = client;
        this.balance = balance;
    }

    public int getAccount(){
        return account;
    }

    public Person getClient() {
        return client;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount)) return false;
        BankAccount that = (BankAccount) o;
        return getAccount() == that.getAccount() &&
                Double.compare(that.getBalance(), getBalance()) == 0 &&
                getClient().equals(that.getClient());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccount(), getClient(), getBalance());
    }

    @Override
    public String toString() {
        return "BankAccount number: " + account +
                "\n" + client.toStringName() +
                "\nbalance: " + balance;
    }

    public boolean credit(double sum){
        if(sum <= balance){
            balance = balance - sum;
            return true;
        }
        return false;
    }

    public void debit(double sum){
        balance = balance + sum;
    }
}

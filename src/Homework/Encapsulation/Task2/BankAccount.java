package Homework.Encapsulation.Task2;

public class BankAccount {
    private String userId;
    private double balance;
    private Currency currency;

    public BankAccount(String userId,Currency currency){
        this.userId = userId;
        this.currency = currency;
    }

    public String getUserId(){
        return userId;
    }

    public double getBalance(){
        return balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void withdraw(double money){
        if(balance < money)
            throw new IllegalArgumentException("Insufficient balance!");
        balance -= money;
    }

    public void deposit(double money){
        balance += money;
    }


}

package Homework.Encapsulation.Task1;

public class Account {

    private String userId;
    private double balance;

    public Account(String userId){
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        if(balance < 0)
            throw new IllegalArgumentException("balance can not less than 0!");
        this.balance = balance;
    }

}

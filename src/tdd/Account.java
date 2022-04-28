package tdd;

public class Account {


    private int balance;
    private String name;
    public int getBalance() {

        return balance;
    }

    public void deposit(int amount) {
        if(amount > 0){
            balance = balance + amount;
        }

    }

    public void withdraw(int amount) {

        if(amount > 0 && amount <= balance ){
            balance = balance - amount;
        }
        else {
            balance = balance;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


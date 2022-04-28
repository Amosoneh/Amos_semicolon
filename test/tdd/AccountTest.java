package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


    @Test
    public void accountCanBeCreatedTest(){
        //given i have created an account
        Account account = new Account();
        //when i check my balance
        int balance = account.getBalance();
        //confirm that my balance is zero
        assertEquals(0, balance);

    }
    @Test
    public void depositMoneyTest(){
        //given that i have an account
        Account myAccount = new Account();
        //when i deposit money
        myAccount.deposit(2000);
        myAccount.deposit(4000);
        //check  that my balance has changed
        assertEquals(6000, myAccount.getBalance());
    }
    @Test
    @DisplayName("Deposit negative amount should not change balance test")
    public void depositNegativeAmountTest(){
        //given that i have an account
        Account amosAccount = new Account();
        //when i deposit a negative amount
        amosAccount.deposit(-1200);
        //check that my balance has not changed
        assertEquals(0,amosAccount.getBalance());


    }
    @Test
    @DisplayName("When withdrawal is less to balance")
    public void withdrawalTest(){
        //given that i have an account
        Account khaledAccount = new Account();
        //when i deposit a negative amount
        khaledAccount.deposit(6000);
        //when i withdraw money
        khaledAccount.withdraw(3000);
        //check that my balance has not changed
        assertEquals(3000, khaledAccount.getBalance());
    }
    @Test
    @DisplayName("When withdrawal is greater than balance")
    public void withdrawTest() {
        //given that i have an account
        Account amAccount = new Account();
        //when i deposit a negative amount
        amAccount.deposit(3000);
        //when i withdraw money
        amAccount.withdraw(4000);
        //check that my balance has not changed
        assertEquals(3000, amAccount.getBalance());
    }
    @Test
    @DisplayName("When withdrawal is negative")
    public void withdrawnTest(){
        //given that i have an account
        Account kedAccount = new Account();
        //when i deposit a negative amount
        kedAccount.deposit(6000);
        //when i withdraw money
        kedAccount.withdraw(-6000);
        //check that my balance has changed
        assertEquals(6000, kedAccount.getBalance());
    }
}


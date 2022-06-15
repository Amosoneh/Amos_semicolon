package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class kataTest {

    @Test
    public void additionTest(){
        Kata calculator = new Kata();
        int result = calculator.add(2, 6);
        assertEquals(8, result);

    }
    @Test
    public void sustractionTest(){
        Kata calculator = new Kata();
        int result = calculator.substract(4, 2);
        assertEquals(2, result);
    }
    @Test
    public void absoluteSubstractionTest(){
        Kata calculator = new Kata();
        int result = calculator.substract(2, 4);
        assertEquals(2, result);
    }
    @Test
    public void productTest(){
        Kata calculator = new Kata();
        int result = calculator.multiply(4, 2);
        assertEquals(8, result);
    }
    @Test
    public void quotientTest(){
        Kata calculator = new Kata();
        int result = calculator.divide(10, 3);
        assertEquals(3,result);
    }
    @Test
    public void divideByZero(){
        Kata calculator = new Kata();
        int result = calculator.divide(10, 0);
        assertEquals(0, result);
    }

    @Test
    public void pricePer1_4Copies(){
        TestDriller testDrill = new TestDriller();
        int amount = testDrill.calculate(4);
        assertEquals(8000, amount);
    }
    @Test
    public void pricePer5_9Copies(){
        TestDriller testDrill = new TestDriller();
        int amount = testDrill.calculate(9);
        assertEquals(16200, amount);
    }
    @Test
    public void pricePer10_29Copies(){
        TestDriller testDriller = new TestDriller();
        int amount = testDriller.calculate(29);
        assertEquals(46400, amount);
    }
    @Test
    public void pricePer30_49Copies(){
        TestDriller testDriller = new TestDriller();
        int amount = testDriller.calculate(49);
        assertEquals(73500, amount);
    }
    @Test
    public void pricePer50_99Copies(){
        TestDriller testDriller = new TestDriller();
        int amount = testDriller.calculate(99);
        assertEquals(128700, amount);
    }
    @Test
    public void pricePer100_199Copies(){
        TestDriller testDriller = new TestDriller();
        int amount = testDriller.calculate(199);
        assertEquals(238800, amount);
    }
    @Test
    public void pricePer200_499Copies(){
        TestDriller testDriller = new TestDriller();
        int amount = testDriller.calculate(499);
        assertEquals(548900, amount);
    }
    @Test
    public void pricePer500_AboveCopies(){
        TestDriller testDriller = new TestDriller();
        int amount = testDriller.calculate(600);
        assertEquals(600000, amount);
    }

    @Test
    @DisplayName("Showing the grades of the range of a score")
    public void passMark(){
        Kata input = new Kata();
        String result = input.score(95);
        assertEquals("Passed", result);
    }

    @Test
    @DisplayName("Showing the grades of the range of a score")
    public void passMark2(){
        Kata input = new Kata();
        String result = input.score(54);
        assertEquals("Failed", result);
    }
    @Test
    @DisplayName("Showing the grades of the range of a score")
    public void scoreRangeGrade(){
        Kata input = new Kata();
        String grade = input.scoreRangeGrade(95);
        assertEquals("A",  grade);
    }

    @Test
    @DisplayName("Showing the grades of the range of a score")
    public void scoreRangeGrade2(){
        Kata input = new Kata();
        String grade = input.scoreRangeGrade(82);
        assertEquals("B",  grade);
    }



    @Test
    @DisplayName("Showing the grades of the range of a score")
    public void scoreRangeGrade3(){
        Kata input = new Kata();
        String grade = input.scoreRangeGrade(75);
        assertEquals("C",  grade);
    }

    @Test
    @DisplayName("Showing the grades of the range of a score")
    public void scoreRangeGrade4(){
        Kata input = new Kata();
        String grade = input.scoreRangeGrade(65);
        assertEquals("D",  grade);
    }

    @Test
    @DisplayName("Showing the grades of the range of a score")
    public void scoreRangeGrade5(){
        Kata input = new Kata();
        String grade = input.scoreRangeGrade(15);
        assertEquals("F",  grade);
    }

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


    @Test
    public void factorsTest(){
        int factors = Kata.noOfFactorsOf(10);
        assertEquals(4,factors);
    }

    @Test
    public void primeNumberTest(){
        boolean isPrime = Kata.isPrime(5);
        assertTrue(isPrime);
    }



}

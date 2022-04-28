package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}

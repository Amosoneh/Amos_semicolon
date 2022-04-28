package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerTest {

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
}

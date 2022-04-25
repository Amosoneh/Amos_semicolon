package tdd_snack_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutomaticBikeTest {

    @Test
    public void autoBikeCanBeCreatedTest(){
        //given i have a bike
        AutoBike myBike = new AutoBike ();
        //when the bike is turned on
        boolean isOn = myBike.setOn();
        //check if the bike in on
        assertEquals(true, myBike.setOn());

    }
    @Test
    public void turnOffTest(){
        //given that i have a bike
        AutoBike myBike2 = new AutoBike();
        //when the bike is turned off
        boolean isOff = myBike2.setOff();
        //check if the bike is off
        assertEquals(false,myBike2.setOff());
    }
    @Test
    public void accelerateTest(){
        //given that i have a bike
        AutoBike myBike3 = new AutoBike();
        //when i increase the speed
        myBike3.increaseSpeed(1);
        //check if my speed increased
        assertEquals(1, myBike3.getSpeed());

    }
    @Test
    public void decelerateTest(){
        //given that i have a bike
        AutoBike myBike3 = new AutoBike();
        //when i increase the speed
        myBike3.decreaseSpeed(1);
        //check if my speed increased
        assertEquals(0, myBike3.getSpeed());

    }
    @Test
    public void speedRange(){
        //given that i have a bike
        AutoBike myBike3 = new AutoBike();
        //when i add a gear
        myBike3.increaseSpeed(1);
        //check if the bike run for a speed and change gear automatically
        assertEquals(1, myBike3.getSpeed());
    }



}

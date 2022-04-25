package tdd_snack1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {


    @Test
    public void AirConditioner(){
        //given that i have an AC
        AirConditioner airCondition = new AirConditioner();
        //when i turned it on
        boolean isOn = airCondition.setOn();
        //check if it's on
        assertEquals(true, airCondition.setOn());
    }
    @Test
    public void setOff(){
        //given that i have an AC
        AirConditioner airCondition = new AirConditioner();
        //my AC is on
        airCondition.setOn();
        //when i turned it off
        boolean isOff = airCondition.setOff();
        //check if it's off
        assertEquals(true, airCondition.setOn());
    }
    @Test
    public void increaseTemperature(){
        //given that i have an AC
        AirConditioner airCondition = new AirConditioner();
        //my AC is on
        airCondition.setOn();
        //when i increase the temperature
        airCondition.increaseTemperature(1);
        airCondition.increaseTemperature(1);
        //check if the temperature is increased
        assertEquals(18, airCondition.getTemperature());
    }
    @Test
    public void decreaseTemperature(){
        //given that i have an AC
        AirConditioner airCondition = new AirConditioner();
        //my AC is on
        airCondition.setOn();
        //when i decrease the temperature
        airCondition.increaseTemperature(1);
        airCondition.increaseTemperature(1);
        airCondition.decreaseTemperature(1);
        //check if the temperature is decreased
        assertEquals(17, airCondition.getTemperature());
    }
    @Test
    public void increaseTemperatureBeyond30(){
        //given that i have an AC
        AirConditioner airCondition = new AirConditioner();
        //my AC is on
        airCondition.setOn();
        //when i increase the temperature beyond 30
        airCondition.increaseTemperature(40);
        //check if the temperature is still 30
        assertEquals(30, airCondition.getTemperature());
    }
    @Test
    public void decreaseTemperatureBeyond30(){
        //given that i have an AC
        AirConditioner airCondition = new AirConditioner();
        //my AC is on
        airCondition.setOn();
        //when i increase the temperature beyond 30
        airCondition.increaseTemperature(1);
        airCondition.increaseTemperature(1);
        airCondition.decreaseTemperature(1);
        //check if the temperature is still 16
        assertEquals(17, airCondition.getTemperature());
    }
}

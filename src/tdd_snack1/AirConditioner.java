package tdd_snack1;

public class AirConditioner {
    boolean isOn = true;
    private boolean isOff;
    int temperature = 16;

    public boolean setOn() {
        return isOn;
    }

    public boolean setOff() {
        return isOff;
    }

    public void increaseTemperature(int temperature) {
        if(this.temperature < 30 && temperature == 1){
        this.temperature += temperature;
        }
        else{
            this.temperature = 30;
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature(int temperature) {
        if(this.temperature == 16 && this.temperature - temperature < 16){
            this.temperature = 16;
        }
        else if(temperature == 1){
            this.temperature -= temperature;
        }
    }
}

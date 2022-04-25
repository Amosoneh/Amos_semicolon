package tdd_snack_2;

public class AutoBike {
    boolean isOn = true;
    private boolean isOff;
    private int speed;
    private  int gear;



    public boolean setOn() {
        return isOn;
    }
    public boolean setOff() {
        return isOff;
    }


    public void increaseSpeed(int gear) {
        if(speed == 20 && gear == 1){
            speed = speed + gear;
        }
        else {
            speed = speed + gearSpeed();
        }

    }

    public int getSpeed() {
        return speed;
    }

    public void decreaseSpeed(int gear) {
        if(speed > 0){
            speed = speed + (-gear);
        }
    }
    public int gearSpeed(){
        if(speed >= 0 && speed <= 20){
            return gear = 1;
        }
        if(speed > 20 && speed <= 30){
            return gear = 2;
        }
        if(speed > 30 && speed <= 40){
            return gear = 3;
        }
        else{
            return gear = 4;
        }
    }

}



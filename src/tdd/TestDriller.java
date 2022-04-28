package tdd;

public class TestDriller {

    public int calculate(int copies) {
        int amount = 0;
        if(copies >= 1 && copies <= 4) {
            amount = copies * 2000;
        }
        if(copies >4 && copies <= 9){
            amount = copies * 1800;
        }
        if(copies >9 && copies <= 29){
            amount = copies * 1600;
        }
        if(copies >29 && copies <= 49){
            amount = copies * 1500;
        }
        if(copies >49 && copies <= 99){
            amount = copies * 1300;
        }
        if(copies >99 && copies <= 199){
            amount = copies * 1200;
        }
        if(copies >199 && copies <= 499){
            amount = copies * 1100;
        }
        else if(copies > 499) {
            amount = copies * 1000;
        }
        return amount;
    }
}

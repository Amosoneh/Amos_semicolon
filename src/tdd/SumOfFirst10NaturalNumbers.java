package tdd;

public class SumOfFirst10NaturalNumbers {
    public static void main(String[] args) {
        int num = 10;
        int a = 3;
        int b = 5;
        int s = 0;
        int i;
        for (i = 1; i <= num; i++) {
            //sum += i;

            if(i != a && i != 5){
                s += i;
                a += a;
                //System.out.println(s);
            }
//            if (i == b){
//                s += i;
//                b += b ;
//                System.out.println(s);
//            }
           // if ()
            System.out.println(i);
        }
//        int i = 1;
//        while (i <= num){
//            sum += i;
//            i++;
//        }

        //System.out.println("Sum of first 10 natural numbers is: "+ sum);
    }
}

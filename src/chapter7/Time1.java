package chapter7;
//
//public class Time1 {
//    private int hour;
//    private int minute;
//    private int second;
//
//    public void setTime(int hour, int minute, int second){
//        if (hour < 0 || hour > 24 || minute < 0 || minute > 60 || second < 0 || second > 60){
//            throw new IllegalArgumentException();
//        }
//        this.hour = hour;
//        this.minute = minute;
//        this.second = second;
//    }
//}
//public class Time1 {
//    public static void main(String[] args) {
//        int[] n = {1,3,5,7,9,30000,-9000,30000,30000,30000};
////        int minSum = Integer.MAX_VALUE;
//        int maxSum = Integer.MIN_VALUE;
//        int count = 0;
//        for (int i = 0; i<n.length; i++){
////            if (n[i] < minSum){
////                minSum = n[i];
////            }
//            if (n[i] > maxSum){
//                maxSum = n[i];
//            }
//        }
//        for(int i: n){
//            if(i == maxSum){
//                count++;
//            }
//        }
//        System.out.print(maxSum +"and i appeared "+count);


//        for(int i = 0; i <=n; i++){
//
//            for(int j = 1; j <=n - i; j++){
//                System.out.print(" ");
//            }
//            for(int k =0; k<= i; k++ ){
//                System.out.print("*");
//            }
//            System.out.println("");
////        }
//    }
//}

public class Time1 {
    public static void main(String[] args) {
    String s = "12:34:22PM";
    String[] st =s.split(":");
    for (String i: st){
        System.out.println(i);
    }

    }

}
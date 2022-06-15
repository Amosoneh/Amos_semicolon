package chapter7;

public class Position {
    static int[] position;
    public static void main(String[] args) {

        int[]totalScore = {300, 100, 60, 70, 900};
        int count = 0;
        int maxNum = 0;
        for (int i= 0; i < totalScore.length; i++){
            maxNum = max(totalScore);
            index(totalScore, maxNum);
        }

        System.out.println(maxNum);

        for(int i: position){
            System.out.println(i);
        }
    }
    public static int max(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) max = j;
        }
        return max;
    }

    public static int[] index(int [] arr, int targetValue){
        position = new int[arr.length];
        int index = -1;
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == targetValue) index = i;
            else index = Integer.MIN_VALUE;
//            index = count;
            position[i] = index;

        }
        return position;
    }
}

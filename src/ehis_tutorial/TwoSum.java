package ehis_tutorial;

public class TwoSum {
    public int[] twoSum(int[] array, int num){
        for (int i = 0; i < array.length-1; i++){
            for (int j = i+1; j < array.length; j++){
                if (array[i] + array[j] == num){
                    return new int[]{
                            array[i], array[j]
                    };
                }
            }
        }
        return new int[]{-1, -1};
    }

    //using map
    public static void main(String[] args) {

    }

}

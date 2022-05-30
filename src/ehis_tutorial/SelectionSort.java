package ehis_tutorial;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr = {3,6,9,8,55,1,4,2,7};
        selectionSort(arr);
        for (int i: arr){
            System.out.print(i+" ");
        }
    }

    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length-1; i++){
            int index = i;
            for (int j = i + 1; j < array.length; j ++){
                if(array[j] < array[index]){
                    index = j;
                }
            }
            int smallNum = array[index];
            array[index] = array[i];
            array[i] = smallNum;
        }
    }
}

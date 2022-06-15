package ehis_tutorial;

public class BinarySort {
    public static void main(String[] args) {
        int[]myArrs = {4,6,7,8,1,2,11,9,10};

        binarySearch(myArrs, 9);
    }
    public static void binarySearch(int[] arr, int num){
        int first = 0;
        int last = arr.length;
        int mid = (first + last) / 2;
        int guess;
        while (first <= last){
            if (arr[mid] < num) first = mid + 1;
            else if (arr[mid] == num){
                System.out.println("Element is found at index "+mid);
                break;
            }
            else last = mid - 1;
            mid = (first + last)/2;
            if (first > last) System.out.println("Element not found");
        }

    }
}

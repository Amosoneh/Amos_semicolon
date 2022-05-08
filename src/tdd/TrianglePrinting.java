package tdd;

public class TrianglePrinting {
    public static void main(String[] args) {
        int i;
        int j;
        int row = 10;
        for(i = 0; i < row; i++){

            for(j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println( );

        }
        System.out.println("Break");
        for(i = row - 1; i >=0; i--){

            for(j = 0; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println("Break");
        for(i = 0; i <=row; i++){

            for(j = 1; j <=row - i; j++){
                System.out.print(" ");
            }
            for(int k =0; k<= i; k++ ){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println("Break");
        for(i = 0; i <=row; i++){

            for(j = 1; j <=row - i; j++){
                System.out.print(" ");
            }
            for(int k =0; k<= i; k++ ){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Break");
        for(i = row; i >=1; i--){

            for(j = row; j > i; j--){
                System.out.print(" ");
            }
            for(int k =1; k<= i; k++ ){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(i = 1; i <=5; i++){

            for(j = 1; j <=5 - i; j++){
                System.out.print(" ");
            }
            for(int k =0; k<= i; k++ ){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("Break");
    }
}

package chapter7;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//
//        int [] number =new int[3];
//        String []name = new String[3];
//        double[] price = new double[3];
//        double[]total = new double[3];
//        double discount ;
//        int counter = 0;
//        boolean continueCondition = true;
//        System.out.println("What is the customer's name?");
//        String userName = s.next();
//        double subTotal = 0;
//        getProduct(s, number, name, price, total, counter, continueCondition, userName,subTotal);
//        getInvoice(s, number, name, price, total, userName, subTotal);


//        myArray2[1] = 66;
//        myArray2[0] = 56;
//        myArray2[3]= 2;
//        myArray2[2] = 3;
//        myArray2[4] = 1;
//        int sum = 0;
//        int min = myArray2[0];
//        int max = myArray2[0];
//        int average = 0;
//        for (int i = 0; i < myArray2.length; i++) {
//            sum += myArray2[i];
//            average = sum / myArray2.length;
//            if (myArray2[i] > max) max = myArray2[i];
//            if (min > myArray2[i]) min = myArray2[i];
//
//        }
//
//        System.out.println("Total sum of my array is " +sum);
//        System.out.println("The average of my array is " +average);
//        System.out.println("The min array is " +min);
//        System.out.println("The max array is " +max);

        //for (int i = 0; i < myArray2.length; i++){
            //myArray2[i] = myArray2[i];
            //System.out.print(myArray2[i]+", ");
//            int randomIndex = (int) (Math.random() * 10);
//            try {
//                System.out.println("array at random index " + randomIndex + " is "+ myArray2[randomIndex]);
//            } catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("Invalid index encountered");
//            }
        //}
//        for (int num : myArray2) System.out.println(num);
//        int money = 10000;
//        deposit(10000);
//        System.out.println(money);
//        int[]values = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9};
//        deposit2(values);
//        System.out.println(java.util.Arrays.toString(values));
//        int [] [] array = {
//                {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20}
//        };
//        for (int i = 0; i < array.length; i++){
//            for (int j = 0; j < array[i].length; j++){
//                System.out.print(array[i] [j] + " ");
//            }
//        }



    }

//    private static void getInvoice(Scanner s, int[] number, String[] name, double[] price, double[] total, String userName, double subTotal) {
//        double discount;
//        System.out.println("Your name:");
//        String cashier = s.next();
//        System.out.println("How much discount will customer get?");
//        discount = s.nextInt();
//
//        String prompt = """
//                        SEMICOLON STORES
//                        MAIN BRANCH
//                        LOCATION: 312 HERBERT MACAULAY WAY, SABO YABA, LAGOS.
//                        TEL: 08142227709
//                        DATE: 28/6/2022 5:22:45 pm.
//                        Cashier: """ + " " + cashier + "\nCustomer: " + userName;
//        System.out.println(prompt);
//        System.out.println("=======================================================");
//        System.out.println("\t\tITEM\t\tQTY\t\tPRICE\t\tTOTAL(NGN)");
//        System.out.println("-------------------------------------------------------");
//        for (int i = 0; i < 3; i++){
//            if (name[i] != null || price[i] != 0 || number[i] !=0 || total[i] != 0) {
//                System.out.printf("%13s %8d \t\t%.2f \t\t%.2f%n", name[i], number[i], price[i], total[i]);
//            }
//        }
//        System.out.println("-------------------------------------------------------");
//        for (double v : total) {
//            subTotal += v;
//        }
//        System.out.printf("\t%35s  %.2f%n","Sub Total: ", subTotal);
//        double discountPrice = (subTotal * discount) / 100;
//        System.out.printf("\t%35s  %.2f%n","Discount: ",discountPrice);
//        double vat=(subTotal * 17.5)/100;
//        System.out.printf("\t%35s  %.2f%n","VAT @ 17.50%: ",vat);
//        System.out.println("=======================================================");
//        double billTotal = subTotal + vat - discountPrice;
//        System.out.printf("\t%35s  %.2f%n","Bill Total: ",billTotal);
//        System.out.printf("\t%35s  %.2f%n","Amount paid: ",billTotal);
//        System.out.println("=======================================================");
//        System.out.println("\t\t\tTHANK YOU FOR YOUR PATRONAGE");
//        System.out.println("=======================================================");
//    }

//    private static void getProduct(Scanner s, int[] number, String[] name, double[] price, double[] total, int counter, boolean continueCondition, String userName, double subTotal) {
//        if (userName != null) {
//
//            while (continueCondition) {
//                System.out.println("What did the customer buy? ");
//                name[counter] = s.next();
//                System.out.println("How many pieces ");
//                number[counter] = s.nextInt();
//                System.out.println("How much per unit ");
//                price[counter] = s.nextDouble();
//
//                total[counter] = price[counter] * number[counter];
//
//                System.out.println("Add more items. yes/no");
//                String userResponse = s.next();
//                if(userResponse.equalsIgnoreCase("NO")||userResponse.equalsIgnoreCase("N")){
//                    continueCondition =false;
//
//                }
//
//                counter++;
//            }
//        }
//    }

    public static void deposit(int amount){
        amount *= 10;
        System.out.println(amount);
        System.out.println("money is now "+ amount);
    }
    public static void deposit2(int[] values){
        values[0] = 18;
        values[values.length - 1] = 89;
    }
}

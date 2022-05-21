package chapter7;

import java.util.Scanner;

public class SalesInvoice {
    static void getProduct(Scanner s, int[] number, String[] name, double[] price, double[] total, int counter, boolean continueCondition, String userName) {
        if (userName != null) {

            while (continueCondition) {
                System.out.println("What did the customer buy? ");
                name[counter] = s.next();
                System.out.println("How many pieces ");
                number[counter] = s.nextInt();
                System.out.println("How much per unit ");
                price[counter] = s.nextDouble();

                total[counter] = price[counter] * number[counter];

                System.out.println("Add more items. yes/no");
                String userResponse = s.next();
                if(userResponse.equalsIgnoreCase("NO")||userResponse.equalsIgnoreCase("N")){
                    continueCondition =false;

                }

                counter++;
            }
        }
    }

    static void getInvoice(Scanner s, int[] number, String[] name, double[] price, double[] total, String userName, double subTotal) {
        double discount;
        System.out.println("Your name:");
        String cashier = s.next();
        System.out.println("How much discount will customer get?");
        discount = s.nextInt();
        int size = 20;

        String prompt = """
                        SEMICOLON STORES
                        MAIN BRANCH
                        LOCATION: 312 HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                        TEL: 08142227709
                        DATE: 28/6/2022 5:22:45 pm.
                        Cashier:""" + " " + cashier + "\nCustomer: " + userName;
        System.out.println(prompt);
        System.out.println("=======================================================");
        System.out.println("\t\tITEM\t\tQTY\t\tPRICE\t\tTOTAL(NGN)");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < size; i++){
            if (name[i] != null || price[i] != 0 || number[i] !=0 || total[i] != 0) {
                System.out.printf("%13s %8d %13.2f %13.2f%n", name[i], number[i], price[i], total[i]);
            }
        }
        System.out.println("-------------------------------------------------------");
        for (double v : total) {
            subTotal += v;
        }
        System.out.printf("\t%35s  %.2f%n","Sub Total: ", subTotal);
        double discountPrice = (subTotal * discount) / 100;
        System.out.printf("\t%35s  %.2f%n","Discount: ",discountPrice);
        double vat=(subTotal * 17.5)/100;
        System.out.printf("\t%35s  %.2f%n","VAT @ 17.50%: ",vat);
        System.out.println("=======================================================");
        double billTotal = subTotal + vat - discountPrice;
        System.out.printf("\t%35s  %.2f%n","Bill Total: ",billTotal);
        System.out.printf("\t%35s  %.2f%n","Amount paid: ",billTotal);
        System.out.println("=======================================================");
        System.out.println("\t\t\tTHANK YOU FOR YOUR PATRONAGE");
        System.out.println("=======================================================");
    }

}

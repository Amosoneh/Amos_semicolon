package chapter7;

import java.util.Scanner;

import static chapter7.SalesInvoice.getInvoice;
import static chapter7.SalesInvoice.getProduct;

public class SalesInvoiceMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = 20;

        int [] number =new int[size];
        String []name = new String[size];
        double[] price = new double[size];
        double[]total = new double[size];
        double discount ;
        int counter = 0;
        boolean continueCondition = true;
        System.out.println("What is the customer's name?");
        String userName = s.next();
        double subTotal = 0;
        getProduct(s, number, name, price, total, counter, continueCondition, userName);
        getInvoice(s, number, name, price, total, userName, subTotal);
    }
}

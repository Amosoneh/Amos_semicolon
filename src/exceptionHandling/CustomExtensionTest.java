package exceptionHandling;


import java.util.Scanner;

public class CustomExtensionTest {
    private static final Scanner scanner = new Scanner(System.in);
    public static void collectInput() throws CustomExtension{
        System.out.println("Enter a positive number: ");
        int userInput = scanner.nextInt();

        if(userInput < 0){
            throw new CustomExtension("Can not take negative integer!!");
        }
    }

    public static void main(String[] args) {
        try{
            collectInput();
        } catch (CustomExtension cE){
            System.out.println(cE.getMessage());
        }
    }
}

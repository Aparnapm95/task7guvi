package task7;


import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
        // Create a scanner object for taking user input
        Scanner scanner = new Scanner(System.in);
        
        // Take two integers as input
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        try {
            // Attempt to perform division
            int result = num1 / num2;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Handle the case where division by zero occurs
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }
}

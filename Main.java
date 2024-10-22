import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to exception testing");

        Scanner sc = new Scanner(System.in);

        try {
            // Input for the first number
            System.out.println("Enter number 1: ");
            int numberOne = sc.nextInt();

            // Input for the second number
            System.out.println("Enter number 2: ");
            int numberTwo = sc.nextInt();

            // Check if numberTwo is greater than numberOne
            if (numberTwo > numberOne) {
                // Throw the custom exception with a message
                throw new NumberTooLargeException("Number 2 (" + numberTwo + ") is greater than Number 1 (" + numberOne + ")");
            }

            // If the exception isn't thrown, print a success message
            System.out.println("Number 1 is greater than or equal to Number 2");
        } 
        // Catch the custom exception and handle it
        catch (NumberTooLargeException e) {
            // Print the exception message
            System.out.println("Caught Exception: " + e.getMessage());
        } 
        finally {
            // Close the scanner resource
            sc.close();
            System.out.println("End of exception testing.");
        }
    }
}

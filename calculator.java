import java.util.Scanner;

public class calculator {

    // Function to clear the screen for a certain time in milliseconds
    public static void clearScreenAndWait(int milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds);  // Wait for the specified time
        System.out.print("\033[H\033[2J");  // Clear the screen
        System.out.flush();  // Ensure the screen is actually cleared
    }

    public static void main(String[] args) throws InterruptedException {
        // Create a Scanner object to read user input from the console
        Scanner inputScanner = new Scanner(System.in);

        // Ask the user to enter the first number
        System.out.println("Enter your first number:");
        double firstNumber = inputScanner.nextDouble(); // Store the value of the first number
        clearScreenAndWait(500);  // Clear the screen for half a second

        // Ask the user to enter the second number
        System.out.println("Enter your second number:");
        double secondNumber = inputScanner.nextDouble(); // Store the value of the second number
        clearScreenAndWait(500);  // Clear the screen for half a second

        // Ask the user to choose an operation (+, -, *, /)
        System.out.println("Enter the operation you want: (+) | (-) | (*) | (/)");
        char operation = inputScanner.next().charAt(0); // Read the operation chosen by the user

        // Perform the calculation based on the chosen operation
        if (operation == '*') {
            clearScreenAndWait(500);  // Clear the screen
            System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));  // Multiplication
        }
        else if (operation == '+') {
            clearScreenAndWait(500);  // Clear the screen
            System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));  // Addition
        }
        else if (operation == '-') {
            clearScreenAndWait(500);  // Clear the screen
            System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));  // Subtraction
        }
        else if (operation == '/') {
            clearScreenAndWait(500);  // Clear the screen
            // Check the second number before performing division to ensure it is not zero and avoid a division by zero error
            if (secondNumber != 0) {
                System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));  // Division
            } else {
                System.out.println("Error: Division by zero is not allowed!");  //  division by zero
            }
        } else {
            clearScreenAndWait(500);  // Clear the screen
            System.out.println("Error: Invalid operation entered.");  //  invalid input
        }
        
     }
}

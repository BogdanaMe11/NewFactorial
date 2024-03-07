package org.example;


// Importing Scanner class for user input
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a number to factorize
        System.out.print("Enter a number to factorize: ");

        // Reading the user input as an integer
        int number = scanner.nextInt();

        // Displaying a message with the entered number
        System.out.println("The factors of " + number + " are:");

        // Initializing variables to calculate factors
        int sumOfFactors = 0;
        int factorCount = 0;

        // Loop to find factors of the entered number
        for(int i = 1; i < number; ++i) {
            // Checking if 'i' is a factor of the entered number
            if (number % i == 0) {
                // Printing the factor
                System.out.print("" + i + " ");

                // Adding the factor to the sum
                sumOfFactors += i;

                // Incrementing the factor count
                ++factorCount;
            }
        }

        // Checking if the entered number is a perfect number
        boolean isPerfect = sumOfFactors == number;

        // Checking if the entered number is a prime number
        boolean isPrime = factorCount == 1;

        // Displaying the total number of factors
        System.out.println("\nTotal number of factors: " + factorCount);

        // Displaying whether the entered number is a perfect number
        System.out.println("Is it a perfect number? " + isPerfect);

        // Displaying whether the entered number is a prime number
        System.out.println("Is it a prime number? " + isPrime);
    }
}

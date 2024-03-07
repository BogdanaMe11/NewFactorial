package org.example;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to factorize: ");
        int number = scanner.nextInt();
        System.out.println("The factors of " + number + " are:");
        int sumOfFactors = 0;
        int factorCount = 0;

        for(int i = 1; i < number; ++i) {
            if (number % i == 0) {
                System.out.print("" + i + " ");
                sumOfFactors += i;
                ++factorCount;
            }
        }

        boolean isPerfect = sumOfFactors == number;
        boolean isPrime = factorCount == 1;
        System.out.println("\nTotal number of factors: " + factorCount);
        System.out.println("Is it a perfect number? " + isPerfect);
        System.out.println("Is it a prime number? " + isPrime);
    }
}

package week2;

import java.util.Scanner;

public class UpperToLower {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a string
        System.out.print("Enter a string in uppercase: ");
        String input = scanner.nextLine();

        // Convert the uppercase string to lowercase
        String lowercase = convertToLowerCase(input);

        // Print the lowercase string
        System.out.println("The string in lowercase: " + lowercase);

        // Close the scanner
        scanner.close();
    }

    // Method to convert uppercase letters to lowercase in a string
    public static String convertToLowerCase(String input) {
        // Use the toLowerCase() method of String class
        String lowercase = input.toLowerCase();
        return lowercase;
    }
}


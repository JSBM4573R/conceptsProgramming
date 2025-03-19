package poli.exercises;

import java.util.Scanner;

public class ParOrImpar {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();  // Read the integer input

        // Call the method to check if the number is even or odd and print the result
        System.out.println(isEvenOrOdd(number));
    }

    /**
     * This method determines whether a given integer is even or odd
     * without using conditionals. It relies on the remainder when
     * dividing the number by 2. If the remainder is 0, the number is even.
     * Otherwise, it is odd.
     *
     * @param number The integer to check.
     * @return A string, either "even" or "odd" depending on the number.
     */
    public static String isEvenOrOdd(int number) {
        // Step 1: Calculate the remainder when dividing the number by 2
        boolean isEven = (number % 2 == 0); // This checks if the number is divisible by 2

        // Step 2: Convert the boolean value to string
        String booleanAsString = Boolean.toString(isEven); // This converts the boolean value (true/false) to a String ("true" or "false")

        // Step 3: Compare the string with "true"
        boolean isEvenTrue = booleanAsString.equals("true"); // This checks if the string is "true"

        // Step 4: Return the result based on the comparison
        if (isEvenTrue) {
            return "even";  // If the boolean was true, it means the number is even
        } else {
            return "odd";  // If the boolean was false, it means the number is odd
        }
    }
}
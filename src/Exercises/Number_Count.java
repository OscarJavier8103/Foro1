package Exercises;

import java.util.Scanner;

public class Number_Count {

    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Read the two numbers A and B
        System.out.println("Enter two numbers (A and B):");
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Ensure A is less than or equal to B
        int min = Math.min(A, B);
        int max = Math.max(A, B);

        // Array to count the occurrences of each digit
        int[] counter = new int[10];

        // Loop through each number between min and max
        for (int i = min; i <= max; i++) {
            // Convert the current number to a string
            String numStr = String.valueOf(Math.abs(i)); // Use Math.abs to handle negative numbers

            // Count the occurrences of each digit in the current number
            for (char c : numStr.toCharArray()) {
                int digit = Character.getNumericValue(c);
                counter[digit]++;
            }
        }

        // Print the result
        for (int i = 0; i < 10; i++) {
            System.out.println("Digit " + i + " is printed " + counter[i] + " times.");
        }

        // Close the scanner
        scanner.close();
    }
}

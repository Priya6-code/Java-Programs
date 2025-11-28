package javafundamentals;

public class AsciiToChar {
    public static void main(String[] args) {
        // Initialize an array with ASCII values
        int[] asciiValues = {65, 66, 67, 68, 69}; // ASCII values for A, B, C, D, E

        // Print corresponding character values in a single row
        for (int i = 0; i < asciiValues.length; i++) {
            System.out.print((char) asciiValues[i] + " ");
        }
    }
}


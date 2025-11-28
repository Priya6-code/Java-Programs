
package javafundamentals;

public class ReverseNumber {

    public static void main(String[] args) {
        int number = 1234; // Example number to reverse
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10; // Get last digit from number
            reversed = reversed * 10 + digit; // Add it to the reversed number
            number /= 10; // Remove the last digit from number
        }

        System.out.println("Reversed Number: " + reversed);
    }
}


	

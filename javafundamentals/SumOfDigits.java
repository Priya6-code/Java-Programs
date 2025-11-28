package javafundamentals;
import java.util.Scanner;
public class SumOfDigits {

    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10; // Add the last digit to the sum
            number /= 10;       // Remove the last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find sum");
        int num=sc.nextInt();// Example number to calculate the sum of its digits
        System.out.println("The sum of all digits in " + num + " is: " + sumDigits(num));
    }
}

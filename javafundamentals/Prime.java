package javafundamentals;
import java.util.Scanner;
public class Prime {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 1 or less are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible by another number, not prime
            }
        }
        return true; // Number is prime
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check for prime");
        int num=sc.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}


package javafundamentals;

public class PrimeBetween {

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
        int start=10;
        int end=99;
        for(int i=start;i<end;i++) {
       
        if (isPrime(i)) {
            System.out.print(i +" ");
       
        }
    }
}
}



package javafundamentals;

public class PrimeBetWithoutLoop {
    static int a = 1;

    static int m1(int i) {
        boolean isPrime = true;

        if (a < 2) {
            isPrime = false;  
        } else {
            for (i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(a); 
        }

        a++;
        m2();
        return i;
    }

    static int m2() {
        if (a > 100) 
            return a;

        a = m1(a);
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");
        m2();
    }
}

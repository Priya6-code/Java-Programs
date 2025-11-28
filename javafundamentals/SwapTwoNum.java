package javafundamentals;

import java.util.Scanner;

public class SwapTwoNum {
	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter val of a" );
		a=s.nextInt();
		System.out.println("Enter val of b");
		b=s.nextInt();	
		c=a;
		a=b;
        b=c;
        System.out.println("After swapping value of a " + a);
        System.out.println("After swapping value of b " + b);

}
}
package javafundamentals;

import java.util.Scanner;

public class LargestofThreeNum {
	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first num" );
		a=s.nextInt();
		System.out.println("Enter second num");
		b=s.nextInt();
		System.out.println("Enter third num");
		c=s.nextInt();
		/*
		if(a>=b && a>=c) {
			System.out.println("The largest"+a);
			
		}
		else if(b>=a && b>=c) {
			System.out.println("The largest"+b);
			
		}
		else {
			System.out.println("The largest"+c);
			
		}
		*/
		// optimized code
		
		int largest=(a>b)?b:c;
		System.out.println("The largest of three num " +largest);
}
}


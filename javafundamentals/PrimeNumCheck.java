package javafundamentals;

import java.util.Scanner;

public class PrimeNumCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int n=sc.nextInt();
		if(n<2) {
			System.out.println("Invalid value ");
		}
		else      
		{
			boolean isPrime=true;
			for(int i=2;i<n/2;i++) {
			if(n%2==0) {
				isPrime=false;
				break;
			}	
		   }

		if(isPrime) {
			System.out.println("Prime num");
		}
		else {
			System.out.println("Not a prime  num");
		}
}
}
}
	



package javafundamentals;
import java.util.Scanner;

public class FactorialofNum {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		System.out.println("Factorial of the num is "+ fact);
	}*/
	
	static long factorial(int n) {
		if(n==0|| n==1){
			return 1;
		}
		return n*factorial(n-1);
		
	}

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			
			System.out.println("The factorial of num "+n+ "is" + factorial(n));
		}
	}




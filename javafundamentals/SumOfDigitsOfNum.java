package javafundamentals;
import java.util.Scanner;
public class SumOfDigitsOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		while(n!=0) {
			int d=n%10;
			sum+=d;
			n/=10;	
		}
		
		System.out.println("Sum of digits of given num "+ sum);
	   

	}

}

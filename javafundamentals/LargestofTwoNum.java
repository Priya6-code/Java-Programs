package javafundamentals;
import java.util.Scanner;
public class LargestofTwoNum {
	public static void main(String[] args) {
	int a,b;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter first num" );
	a=s.nextInt();
	System.out.println("Enter second num");
	b=s.nextInt();
	if(a>b) {
		System.out.println("The largest of two num is"+a);
	}
	else {
		System.out.println("The largest of two num is"+b);
	}

}
}

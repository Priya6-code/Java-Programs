package javafundamentals;
import java.util.*;
public class RevNumWithOutBuiltInFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number you want to reverse");
		int num=sc.nextInt();
		
		int rev=0;
		while(num!=0) {
			int d=num%10;
			rev=rev*10+d;
			num=num/10;
		}
		System.out.println("ReversedNum" +rev);

	}

}

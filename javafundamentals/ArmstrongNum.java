package javafundamentals;
import java.util.Scanner;
public class ArmstrongNum {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();
		int orgnum=num;
		int sum=0;
		while(num!=0) {
			int t=num%10;
			 sum+=t*t*t;
			 num/=10;
			 
		}
		if(orgnum ==sum) {
	        System.out.println("The given num is armstrong");
		}
	   else {
		 System.out.println("The given num is not armstrong");
	   }
	

}
}

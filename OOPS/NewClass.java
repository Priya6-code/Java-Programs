package OOPS;
import java.lang.*;

class Calculator{
	Calculator(){
	
	
	}
	static int powerInt(int num1,int num2) {
		return(int)Math.pow(num1, num2);
		
		
	}
	static double powerDouble(double num1,int num2 ) {
		return(double)Math.pow( num1, num2);
	}
		
	}


public class NewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		double result=c.powerInt(2, 3);
		System.out.println("The power int is"+result);
		double result1=c.powerDouble(1.0,2);
		System.out.println("The power double is"+result1);
		
		
		
	

	}

}

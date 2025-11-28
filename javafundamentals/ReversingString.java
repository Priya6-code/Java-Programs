package javafundamentals;

import java.util.Scanner;

public class ReversingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		String s=sc.nextLine();
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(""+s.charAt(i));
		}

	}

}

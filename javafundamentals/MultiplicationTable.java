package javafundamentals;

import java.util.Scanner;

public class MultiplicationTable {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<=10;i++) {
			System.out.println(n+ "*" +i+ "=" +(n*i));
		}
	}

}

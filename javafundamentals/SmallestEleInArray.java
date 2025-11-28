package javafundamentals;

import java.util.Scanner;
public class SmallestEleInArray {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		
		System.out.println("Enter"+n+ "elements");
		int[] arr=new int[n];	
		int i;
		for ( i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
		
		int min=arr[0];
		for (i = 1; i < n; i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
		
	}
		System.out.println("Minimum element is " + min);

}

}
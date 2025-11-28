package javafundamentals;

import java.util.Scanner;

public class LargestElemInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of an array");
		int num=sc.nextInt();
		System.out.println("Enter" +num+ "elements");
		int[] arr=new int[num];
		int i;
		for(i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(i=1;i<arr.length;i++)
		if(arr[i]>max) {
			max=arr[i];
			
		}
		
		System.out.println("Maximun element in an array is " + max );

	}

}

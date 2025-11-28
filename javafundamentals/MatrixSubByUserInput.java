package javafundamentals;

import java.util.Scanner;

public class MatrixSubByUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of rows");
		int rows=sc.nextInt();
		System.out.println("Enter no of cols");
		int cols=sc.nextInt();
		
		int m1[][]=new int[rows][cols];
		int m2[][]=new int[rows][cols];
		int s[][]=new int[rows][cols];
		
		System.out.println("Enter elements of matrix1");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++){
				
				m1[i][j]=sc.nextInt();
			}	
		}
		
		System.out.println("Enter elements of matrix2");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++){
				
				m2[i][j]=sc.nextInt();
			}	
		}
		
			for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++){
				
				s[i][j]=m1[i][j]-m2[i][j];
			}
			
		}
			
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++){
				
				System.out.print(" " + s[i][j]);
			}
			System.out.println();	
		}
		

	}

}

 package javafundamentals;
 import java.util.Scanner;

 public class MatrixMultiplication {

 	public static void main(String[] args) {
 		// TODO Auto-generated method stub
 		
 		Scanner sc=new Scanner(System.in);
 		
 		System.out.println("Enter no of rows for matrix 1");
 		int rows1=sc.nextInt();
 		System.out.println("Enter no of cols for matrix 1");
 		int cols1=sc.nextInt();
 		
 		System.out.println("Enter no of rows for matrix 2");
 		int rows2=sc.nextInt();
 		System.out.println("Enter no of cols for matrix 1");
 		int cols2=sc.nextInt();
 			
 		int m1[][]=new int[rows1][cols1];
 		int m2[][]=new int[rows2][cols2];
 		int s[][]=new int[rows1][cols2];
 		
 		System.out.println("Enter elements of matrix1");
 		for(int i=0;i<rows1;i++) {
 			for(int j=0;j<cols1;j++){
 				
 				m1[i][j]=sc.nextInt();
 			}	
 		}
 		
 		System.out.println("Enter elements of matrix2");
 		for(int i=0;i<rows2;i++) {
 			for(int j=0;j<cols2;j++){
 				
 				m2[i][j]=sc.nextInt();
 			}	
 		}
 		
 		if(cols1!=rows2) {
 			System.out.println("Multiplication not possible");
 		}
 		
 		
 			for(int i=0;i<rows1;i++) {
 			for(int j=0;j<cols2;j++){
 				s[i][j]=0;
 				for(int k=0;k<cols1;k++) {
 				s[i][j]+=m1[i][k]*m2[k][j];
 			}
 			
 		}
 			}
 		for(int i=0;i<rows1;i++) {
 			for(int j=0;j<cols2;j++){
 				
 				System.out.print(" " + s[i][j]);
 			}
 			System.out.println();	
 		}
 		

 	
 	}
 }

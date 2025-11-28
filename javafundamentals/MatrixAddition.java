package javafundamentals;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[][]= {{1,2} ,{2,3} ,{3,5}};
		
		int B[][]= {{2,2} ,{5,3} ,{7,5}};
		int C[][]= new int[3][2];
		int m=3;
		int n=2;
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				C[i][j]=A[i][j]+B[i][j];	
		        
	    }
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(" "+ C[i][j]);
			}
		System.out.println();
	}
}
}


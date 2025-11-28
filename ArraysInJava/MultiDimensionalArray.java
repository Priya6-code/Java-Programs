package ArraysInJava;

public class MultiDimensionalArray {
	
	public static void main(String[] args) {
		
		int[][][] a= {{{2,3,4},{3,6,8},{3,8,5},
		               {2,4,6},{2,3,4},{2,3,4} }};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println(a[i][j][k]+ " ");
				}
			}
			System.out.println("----");
		}
		
}
}

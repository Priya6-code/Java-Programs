package PatternProgramsBasicToAdvanced;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int k;
		for(int i=1;i<n;i++) {
			for(k=5-i;k>=1;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}

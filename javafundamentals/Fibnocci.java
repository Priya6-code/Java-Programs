package javafundamentals;

public class Fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0,n2=1,n=5;
		
		System.out.println("The fibnocci of the series is");
		System.out.println(n1+ " "+n2);	
		for(int i=0;i<n;i++) {
			
			int n3=n1+n2;
			System.out.println(" " +n3);
			n1=n2;
			n2=n3;
			
		}
		
	}

}

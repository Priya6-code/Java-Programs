package javafundamentals;

public class SumOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {10,20,30};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println("The sum of arrays is :" +sum);

	}

}

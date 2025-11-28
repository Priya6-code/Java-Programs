package javafundamentals;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,4,5};
		int n=4;	

		for(int i=1;i<n;i++) {
			boolean found=false;
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==i) {
				found=true;
			}
		}
		
		if(!found) {
			System.out.println(""+i);
		}
	}

}
}

package javafundamentals;

import java.util.Arrays;

public class OnetimeRepetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int[] arr= {1,1,1,1,5,5,8,8,6,7};
		System.out.println("Original array"+Arrays.toString(arr));
		 
		
		
		for(i=0;i<arr.length;i++) {
			boolean found=false;
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				found=true;
				break;
			}
		
			}
		boolean isunique=false;
		for(int k=0;k<i;k++) {
			if(arr[i]==arr[k]) {
				isunique=true;
				break;
			}
		}
		
	
		if(found &&!isunique) {
			
			//dupli[dupIndex++]=arr[i];
			System.out.println(arr[i]+ "");
		}
		}

	
}
}



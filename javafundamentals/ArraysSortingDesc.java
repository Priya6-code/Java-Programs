package javafundamentals;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSortingDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr= {456,905,129,756};
	    System.out.println("Original array"+Arrays.toString(arr));
	    
	    for(int i=0;i<arr.length;i++) {
	    	Arrays.sort(arr,Collections.reverseOrder());
	    	
	    	
	    }
	    System.out.println("Sorted array"+Arrays.toString(arr));

	}

}

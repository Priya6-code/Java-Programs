package javafundamentals;

import java.util.Arrays;

public class ArraySortingAsce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {6,7,3,1};
		System.out.println("Original array" +Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			Arrays.sort(arr);
		}
        System.out.println("Sorted array in ascending order" + Arrays.toString(arr));
}
}

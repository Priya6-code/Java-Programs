package javafundamentals;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr= {3,4,7,8};
         System.out.println("Before reversing ");
         
         for(int i=0;i<arr.length;i++) {
        	 System.out.println(+ arr[i]);	 
         }
         
         System.out.println("After reversing ");
         for(int i=arr.length-1;i>=0;i--) {
        	 System.out.println(+ arr[i]);
         }
         
 
	}

}

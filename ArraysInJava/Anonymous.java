package ArraysInJava;

public class Anonymous {

	    public static void main(String[] args)
	    {
	        int[] i = {1, 2, 3, 4};   //This is the correct way
	 
	      //  i = {1, 2, 3 , 4};     //Compile time error
	 
	        i = new int[]{1, 2, 3, 4};  //This is also correct way
	        
	        System.out.println(i);
	        
	        System.out.println(new int[] {1,2,3}.length);
	    }
	}
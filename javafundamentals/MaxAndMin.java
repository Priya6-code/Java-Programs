package javafundamentals;

public class MaxAndMin {

    public static void main(String[] args) {
		int []array= {20,56,43,50};
	
		    int max = array[0];
		    int min = array[0];

		      
		        for (int i = 1; i < array.length; i++) {
		            if (array[i] > max) {
		                max = array[i]; 
		            }
		            if (array[i] < min) {
		                min = array[i];
		            }
		        }

		        // Print the maximum and minimum elements
		        System.out.println("Maximum element in the array: " + max);
		        System.out.println("Minimum element in the array: " + min);
		    }

  	}


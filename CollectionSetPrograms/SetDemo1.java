package CollectionSetPrograms;

import java.util.HashSet;
import java.util.Scanner;

public class SetDemo1 {

	public static void main(String[] args) {

      HashSet<Integer> hs=new HashSet<>();
   
      System.out.println("Enter number of elements");
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
    
      int val = 0;
      System.out.println("Enter elements ");
      for(int i=0;i<n;i++) {
    	  val=s.nextInt();
    	 
    	  
    	  if(!hs.add(val)) {
    		  System.out.println("Duplicate is "+ val);
    	  }
      }
      System.out.println(hs);
    
	}

}

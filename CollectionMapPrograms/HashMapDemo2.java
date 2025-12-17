package CollectionMapPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class HashMapDemo2 {

	public static void main(String[] args) {
 
	 System.out.println("Enter entries");
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     HashMap<String,Integer> hm=new HashMap<>();
      HashSet<Integer> hs=new HashSet<>();
     s.nextLine();
     for(int i=0;i<n;i++) {
    	 System.out.println("Enter keys");
    	 String keys=s.nextLine();
    	 
    	 System.out.println("Enter values");
    	 int values=s.nextInt();
    	 s.nextLine();
    	 
    	 if(hs.add(values)) {
    		hm.put(keys,values);
    	 }else {
    		 System.out.println("Duplicate found" +values);
    		 hm.remove(values);
    	 }
    	 
    	 
     }
     
     System.out.println(hm);
     		
	}

}

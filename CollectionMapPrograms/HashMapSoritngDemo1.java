package CollectionMapPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapSoritngDemo1 {

	public static void main(String[] args) {

		 System.out.println("Enter entries");
         Scanner s=new Scanner(System.in);
         HashMap<Integer,String> hm=new HashMap<>();
         int n=s.nextInt();
         for(int i=0;i<n;i++) {
        	 System.out.println("Enter keys");
        	 int keys=s.nextInt();
        	 
        	 s.nextLine();
        	 
        	 System.out.println("Enter values");
        	 String values=s.nextLine();
        	 
        	 hm.put(keys,values);
         }
         
         TreeSet<Map.Entry<Integer,String>> ts=new TreeSet<>(Map.Entry.comparingByValue());
         ts.addAll(hm.entrySet());
         System.out.println(ts);
		
		TreeMap<Integer,String> tm=new TreeMap<>(hm);
		System.out.println(tm);
		
  
	}

}

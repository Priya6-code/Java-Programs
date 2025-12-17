package CollectionMapPrograms;

import java.util.*;

public class CountNumofFreqUsingTreeMapSc {

	public static void main(String[] args) {

	  System.out.println("enter num of entries");
      Scanner s=new Scanner(System.in); 
      int n=s.nextInt();
      s.nextLine();
      TreeMap<String,Integer> tm=new TreeMap<>();
      for(int i=0;i<n;i++) {
    	  System.out.println("Enter names");
    	  String names=s.nextLine();
    	  
    	  tm.put(names,tm.getOrDefault(names,0)+1);
    	  
      }
      System.out.println(tm);
	}

}

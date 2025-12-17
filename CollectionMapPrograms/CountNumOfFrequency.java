package CollectionMapPrograms;

import java.util.*;

public class CountNumOfFrequency {

	public static void main(String[] args) {

		String[] names= {"Alice","Bob","John","Alice"};
		HashMap<String,Integer> hm=new HashMap<>();
		
		for(int i=0;i<names.length;i++) {
			
				hm.put(names[i],hm.getOrDefault(names[i],0)+1);
				
			
		}
		System.out.println(hm);
		
		
             
      

	}

}


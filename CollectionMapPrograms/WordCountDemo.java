package CollectionMapPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCountDemo {

	public static void main(String[] args) {
		
		List<String> l=Arrays.asList("Java","Java","Python","Python","C");
		
		Map<String,Integer> hm=new HashMap<>();
		
		for(String s:l ) {
			// s=s.toLowerCase();
			 hm.put(s,hm.getOrDefault(s,0)+1);
		}
		System.out.println(hm);

	}

}

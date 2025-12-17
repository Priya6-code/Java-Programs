package CollectionMapPrograms;

import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		
		String[] s= {"Priya","Ram","Ram","Priya"};
		TreeMap<String,Integer> tm=new TreeMap<>();
		for(int i=0;i<s.length;i++) {
			
			tm.put(s[i],tm.getOrDefault(s[i],0)+1);
			
		}
		System.out.println(tm);

	}

	

}

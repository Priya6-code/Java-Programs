package CollectionMapPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {


		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"Priya");
		hm.put(9,"Ram");
		hm.put(7,"Sriya");
		hm.put(null,"Rani");
		hm.put(null,"Ravi");
		hm.put(null,"Yar");
		hm.remove(1);
		System.out.println(hm);
		System.out.println(hm.size());
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.containsKey(9));
		System.out.println(hm.containsValue("Ram"));
		System.out.println(hm.isEmpty());
		 
		for(Entry<Integer, String> en:hm.entrySet()) {
			if(en.getKey()!=null && en.getKey()==9) {
				en.setValue("Ramu");
			}	
		}
		System.out.println(hm);
	}

}

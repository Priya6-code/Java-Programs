package CollectionFrameworkPrograms;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		
		Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
		ht.put("Priya",1);
		ht.put("Anil",2);
		ht.put("Raju",3);
		System.out.println("The tree elements are:"+ht);
		System.out.println("The size "+ht.size());
	    System.out.println("key is"+ht.get(3));
	    
	    //System.out.println("After removing " + ht.remove(2));
	    
	    System.out.println("The key ele" +ht.containsKey(2));

	}

}

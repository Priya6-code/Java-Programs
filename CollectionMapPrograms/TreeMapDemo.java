package CollectionMapPrograms;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

      TreeMap<Integer,String> tm=new TreeMap<>();
      tm.put(1,"Priya");
      tm.put(2,"Ram");
      tm.put(3,"Ravi");
      tm.put(4,"Anu");
      tm.get(1);
      
      tm.remove(3);
      System.out.println(tm.containsValue("Ram"));
      System.out.println(tm.size());
      System.out.println(tm.size());
      System.out.println(tm);
      

	}

}

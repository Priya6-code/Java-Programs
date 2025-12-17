package CollectionMapPrograms;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

      LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(16, 0.75f, true);
      lhm.put(4,"Priya");
      lhm.put(2,"Sri");
      lhm.put(1,"Ravi");
      lhm.put(0,"Ram");
      
     lhm.get(2);
     lhm.get(1);
      System.out.println(lhm);
      
      
     /* System.out.println(lhm.remove(0));
      System.out.println(lhm);

      System.out.println(lhm.containsKey(4)); */
	}

}

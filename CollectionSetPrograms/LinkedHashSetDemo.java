package CollectionSetPrograms;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

      LinkedHashSet<String> lhs=new LinkedHashSet<>();
      lhs.add("C");
      lhs.add("A");
      lhs.add("B");
      lhs.add("A");
      lhs.add("C");
      lhs.add("C");
      System.out.println(lhs);
     
	}

}

package CollectionSetPrograms;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {

     HashSet<Integer> s=new HashSet<>();
     s.add(10);
     s.add(10);
     s.add(20);
     s.add(20);
     s.add(30);
     System.out.println(s);
     if(s.contains(20)) {
    	 s.remove(20);
     }
     System.out.println(s);

	}

}

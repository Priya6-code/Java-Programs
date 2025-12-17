package CollectionSetPrograms;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {

      LinkedHashSet<String> lhs=new LinkedHashSet<>();
      LinkedHashSet<String> lhs1=new LinkedHashSet<>();
      Scanner s=new Scanner(System.in);
      System.out.println("Enter num of  names");
      int n=s.nextInt();
      s.nextLine();
       System.out.println("Enter names");
      for(int i=0;i<n;i++)
      {
            String m=s.nextLine();
           if(!lhs.add(m)) {
        	   System.out.println("Duplicate string " + m);
        	   lhs1.add(m);
           }

	}
      System.out.println(lhs1);
      System.out.println(lhs);
      

}
}

package CollectionMapPrograms;


import java.util.*;
public class LinkedHashMapDemo1 {

	public static void main(String[] args) {

    Scanner s=new Scanner(System.in);
    System.out.println("Enter num of entries");
    int n=s.nextInt();
   s.nextLine();
    LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
    for(int i=0;i<n;i++) {
    	System.out.println("Enter keys");
    	int keys=s.nextInt();
    	s.nextLine();
    	System.out.println("Enter values");
    	String values=s.nextLine();
    	lhm.put(keys,values);
    
    }
     System.out.println(lhm);
	}

}


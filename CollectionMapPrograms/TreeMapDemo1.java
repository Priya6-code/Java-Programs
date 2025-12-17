package CollectionMapPrograms;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
 
		     System.out.println("Enter number of entries");
             Scanner s=new Scanner(System.in);
             TreeMap<String,Integer> tm=new TreeMap<>();
             int n=s.nextInt();
            s.nextLine();
             for(int i=0;i<n;i++) {
            	 System.out.println("Enter keys");
            	 String keys=s.nextLine();
            	 
            	
            	 System.out.println("Enter values");
            	 int values=s.nextInt();
            	 s.nextLine();
            	 
            	 tm.put(keys,values);
             }
             System.out.println(tm);
	}

}

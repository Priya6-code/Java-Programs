package CollectionMapPrograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class HashMapSortingDemo {

	public static void main(String[] args) {
 
		
         System.out.println("Enter entries");
		Scanner s=new Scanner(System.in);
		HashMap<Integer,String> hm=new HashMap<>();
		
		int n=s.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("enter keys");
			int keys=s.nextInt();
			
			s.nextLine();
			System.out.println("enter values");
			String values=s.nextLine();
			
			hm.put(keys,values);
		
		}
		
		TreeMap<Integer,String> tm=new TreeMap<>(hm);
		System.out.println(tm);
		
	/*	TreeMap<Integer,String> tm=new TreeMap<>(Collections.reverseOrder());
		tm.putAll(hm);
		System.out.println(tm); */

	}

}

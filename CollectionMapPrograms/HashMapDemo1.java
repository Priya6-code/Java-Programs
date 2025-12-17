package CollectionMapPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<>();
		Set<String> s1=new HashSet<>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter num of entries");
		int n=s.nextInt();
		s.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("Enter key");
			int keys=s.nextInt();
			
			s.nextLine();
			
			System.out.println("Enter value");
			String val=s.nextLine();
			
			if(s1.add(val)) {
				hm.put(keys,val);
			}else {
				System.out.println("Duplicate value skipped " + val );
				hm.remove(val);
			}	
		}
		System.out.println(hm);
	}
	

}

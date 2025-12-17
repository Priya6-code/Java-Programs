package CollectionSetPrograms;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elem");
		int n=s.nextInt();
		System.out.println("Enter elem");
		s.nextLine();
		for(int i=0;i<n;i++) {
			String val=s.nextLine();
			
			if(val.equals("null")) {
				ts.add(null);
			}else {
				ts.add(val);
			}
		}
        
		System.out.println(ts);
	}

}

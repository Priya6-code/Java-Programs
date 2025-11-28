package Java8features;

import java.util.function.Predicate;
public class PredicateDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names= {"Anu","AnuDeepika","Anupma","Priya","Anil"};
		
		Predicate<String> p=name -> name.charAt(0)=='A';
		
		for(String name:names) {
			if(p.test(name)) {
				System.out.println(name);
				
			}
		}
 //System.out.println(0.2+0.4==0.6);
	}

}

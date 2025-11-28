package Java8featuresPrograms;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []names= {"Priya","Amrutha","Anil","Arnav"};
		Predicate<String> p= name->name.charAt(0)=='A';
		for(String name:names) {
			if(p.test(name)) {
			System.out.println("Words starting with letter A "+ name);
		}
		

	}

}
}

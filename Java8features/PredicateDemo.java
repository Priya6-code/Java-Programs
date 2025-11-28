package Java8features;

import java.util.function.*;
public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p=i->i>10;
		System.out.println(p.test(7));
		System.out.println(p.test(15));

	}

}

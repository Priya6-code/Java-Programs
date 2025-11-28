package StreamsPrograms;

import java.util.Arrays;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {


		List<String> m=Arrays.asList("Priya","Ram","Anil","Anu");
		
		m.stream().map(i->i.toUpperCase())
		          .forEach(n->System.out.println(n));
		
		m.stream().mapToInt(i->i.length()).forEach(p->System.out.println(p));
				

	}

}

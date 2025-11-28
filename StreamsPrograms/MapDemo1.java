package StreamsPrograms;

import java.util.Arrays;
import java.util.List;

public class MapDemo1 {

	public static void main(String[] args) {

      List<String> l=Arrays.asList("Priya","Ram","Ravi","Shivam","Anu");
      l.stream().filter(i->i.startsWith("R"))
                .map(n->n.length())
                .forEach(p->System.out.println(p));
       
		
	}

}

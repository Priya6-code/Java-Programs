package StreamsPrograms;

import java.util.Arrays;
import java.util.List;

public class FilterDemo2 {

	public static void main(String[] args) {


		List<String> l=Arrays.asList("Priya","Ram","Anu","Anil","Pradeep");
		
		l.stream().filter(i->i.startsWith("A")).forEach(i->System.out.println("Names start with A " +i));

	}

}

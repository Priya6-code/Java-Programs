package StreamsPrograms;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo1 {

	public static void main(String[] args) {

   List<Integer> l=new ArrayList<>();
   l.add(32);
   l.add(23);
   l.add(15);
   l.stream().filter(i->i>20).forEach(i->System.out.println("Filtering using streams"+i));

   
   
   

	}

}

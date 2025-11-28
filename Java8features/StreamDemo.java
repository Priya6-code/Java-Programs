package Java8features;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		Stream<Integer> st=Stream.of(1,2,3);
		ArrayList<String> names=new ArrayList<>();
		names.add("Priya");
		names.add("Sravs");
		names.add("Anil");
		Stream<String> stream2 = names.stream();
		


		

	}

}

package CollectionSetPrograms;

import java.util.TreeSet;

public class ComparableDemo {

	public static void main(String[] args) {
		
		TreeSet<StudentDemo> ts=new TreeSet<>();
		
		ts.add(new StudentDemo(3, "Ram"));
        ts.add(new StudentDemo(1, "Priya"));
        ts.add(new StudentDemo(2, "Anu"));

        System.out.println(ts);
		
		
	}

	

}

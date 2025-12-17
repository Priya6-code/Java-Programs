package CollectionSetPrograms;

import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		TreeSet<Students> ts=new TreeSet<>(new IdComparator());
		
		
		ts.add(new Students(2,"Priya"));
		ts.add(new Students(1,"Ram"));
		ts.add(new Students(0,"Riya"));
		
		System.out.println(ts);
		
		TreeSet<Students> ts1=new TreeSet<>(new NameComparator());
		
		ts1.add(new Students(2,"Priya"));
		ts1.add(new Students(1,"Ram"));
		ts1.add(new Students(0,"Riya"));
		
		System.out.println(ts1);
		

	}

}

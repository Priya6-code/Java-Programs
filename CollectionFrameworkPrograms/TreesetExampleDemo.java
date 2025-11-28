package CollectionFrameworkPrograms;

import java.util.TreeSet;

public class TreesetExampleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Priya");
		ts.add("Ram");
		ts.add("Deepika");
		ts.add("null");
		ts.add("Anil");
		System.out.println(ts);
		
		TreeSet ts1=new TreeSet();
		//ts1.add(new StringBuffer("Java"));//class cast exception
		ts1.add("Sravs");
		ts1.add("Ravi");
		ts1.add("null");
		ts1.add("Pri");
		System.out.println(ts1);

	}

}

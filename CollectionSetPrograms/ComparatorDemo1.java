package CollectionSetPrograms;

import java.util.TreeSet;

public class ComparatorDemo1 {

	public static void main(String[] args) {

     TreeSet<Employee> ts=new TreeSet<>(new EmpIdComparator());
     ts.add(new Employee(5,"Priya",100000.0));
     ts.add(new Employee(2,"Ram",20000.0));
     ts.add(new Employee(5,"Anu",50000.0));
     System.out.println(ts);
     
     TreeSet<Employee> ts1=new TreeSet<>(new EmpNameComparator());
     ts1.add(new Employee(5,"Priya",100000.0));
     ts1.add(new Employee(2,"Ram",20000.0));
     ts1.add(new Employee(5,"Anu",50000.0));
     System.out.println(ts1);

	}

}

package CollectionSetPrograms;

import java.util.Comparator;

public class EmpIdComparator implements Comparator<Employee> {
	
	public int compare(Employee e1,Employee e2) {
		return e1.empid-e2.empid;
	}

}

package CollectionSetPrograms;

import java.util.Comparator;

public class IdComparator implements Comparator<Students>{
	
	public int compare(Students s1,Students s2) {
		return s1.stid-s2.stid;
	}

}

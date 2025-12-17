package CollectionSetPrograms;


public class StudentDemo implements Comparable<StudentDemo>{

	int id;
	String name;
	public StudentDemo(int id, String name) {
		this.id=id;
		this.name=name;
		
	}
	@Override
	public int compareTo(StudentDemo s) {
		
		return this.id-s.id;
	}
	@Override
	public String toString() {
		return id+" "+name;
	}

}


package CollectionSetPrograms;

public class Employee {
	
	int empid;
	String empname;
	Double empsal;
	Employee(int empid,String empname,Double empsal){
		
		this.empid=empid;
		this.empname=empname;
		this.empsal=empsal;
		
	}
	
	public String toString() {
		return empid+" "+empname+ " "+empsal;
	}

}

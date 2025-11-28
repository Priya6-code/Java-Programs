package PatternProgramsBasicToAdvanced;

import java.util.stream.Stream;

public class EmployeesDemo {
	static class Employee{
	String name;
	int age;
	double salary;
	Employee(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	}

	public static void main(String[] args) {

          Employee e1=new Employee("Priya",22,50000.0);
          Employee e2=new Employee("riya",21,40000.0);
          Employee e3=new Employee("Ramya",24,540000.0);
          Employee e4=new Employee("Sriya",25,55000.0);
          Employee e5=new Employee("Priyanka",27,59000.0);
          
          Stream<Employee>stream=Stream.of(e1,e2,e3,e4,e5);
          stream.filter(i->i.salary>=50000.0)
          .map(i->i.name+" " +i.age)
          .forEach(i->System.out.println("emp salary >50000 "+ i));
          
		
	}

}

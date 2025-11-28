package Java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

 class Person {
  
	String name;
	int age;
	public Person(String name,int age) {
		
		this.name=name;
		this.age=age;
		
	}
	
public class PersonAge{
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1=new Person("Priya",22);
		Person p2=new Person("Ram",21);
		Person p3=new Person("Anil",29);
		Person p4=new Person("Riya",16);
		
		List<Person> persons=Arrays.asList(p1,p2,p3,p4);
		
		Predicate<Person> predic=pn->pn.age>=18;
		for(Person p:persons) {
			if(predic.test(p)) {
				System.out.println(p.name);
			}
		}
		

	}

}
 }

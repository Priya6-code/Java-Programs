package Java8featuresPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person{
	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
}

public class PredicateDemo3 {

	public static void main(String[] args) {

		Person p1=new Person("Priya",22);
		Person p2=new Person("Anil",30);
		Person p3=new Person("Ram",21);
		Person p4=new Person("Deepu",20);
		
		List<Person> pr=Arrays.asList(p1,p2,p3,p4);
		
		Predicate<Person> pm=p->p.age>=18;
		for(Person p:pr) {
			if(pm.test(p)) {
				System.out.println(p.name);
			}
		}

	}

}

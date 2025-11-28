package StreamsPrograms;

import java.util.stream.Stream;

public class FilterDemo3 {
	
	static class User{
		int age;
		String name;
		User(String name,int age){
			this.age=age;
			this.name=name;
		}
		 public String toString(){
		        return "User [name=" + name + ", age=" + age + "]";
		    }
		
	}
	
	

	public static void main(String[] args) {


		User u1=new User("Priya",22);
		User u2=new User("Riya",23);
		User u3=new User("Ramya",20);
		User u4=new User("Payal",25);
		User u5=new User("Preethi",26);
		Stream<User> stream=Stream.of(u1,u2,u3,u4,u5);
		stream.filter(i->i.age>18 && i.name.startsWith("P")).forEach(i->System.out.println(i));
		

	}

}

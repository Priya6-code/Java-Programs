package OOPS;

public class Demo1 {
	
	int num;
	String name;
	String dept;
	Demo1(int num,String name1,String dept1){
		this.num=num;
		name=name;
	   dept=dept;
				
	}
	public void display() {
		System.out.println(num);
		System.out.println(name);
		System.out.println(dept);
	}

	public static void main(String[] args) {
		Demo1 d=new Demo1(5,"Priya","IT");
     d.display();
	}

}

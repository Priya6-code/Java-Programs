package OOPS;
class Fruit{
	String name;
	String taste;
	String size;
	
	
	public void eat() {
		System.out.println("Mango" );
		System.out.println("Sweet");
		System.out.println("Big");
	}

}
	
class Apple extends Fruit{
	public void eat() {
		System.out.println("Gauva" );
		System.out.println("Sour");
		System.out.println("small");
	
}
}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a=new Apple();
		
		a.eat();
		
		
	}
}




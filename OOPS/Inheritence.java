package OOPS;
class Animal{
	public void eat() {
		System.out.println("Eat");
		
	}
	public void sleep() {
		System.out.println("sleep");
	}
}
class Bird extends Animal{
	public void fly() {
		System.out.println("fly");
	}
	
}
	
public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
		b.fly();
		b.sleep();
		b.eat();
		

	}

}

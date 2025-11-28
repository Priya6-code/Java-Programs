package Java8featuresPrograms;

public class Outer {
	
	static int a=10;
	static class Inner{
		void show() {
			System.out.println("Heloo Priya");
		}
		
	}

	public static void main(String[] args) {
		
		Outer.Inner i=new Outer.Inner();
		i.show();
	}

}

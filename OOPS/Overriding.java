package OOPS;
class Shape{
	public void draw() {
		System.out.println("Drawing shape");
	}
	public void erase() {
		System.out.println("Erasing shape");
	}
}
	class Circle extends Shape{
		public void draw() {
			System.out.println("drawing Circle");
		}
		public void erase() {
			System.out.println("Erasing Circle");
	     }
	}
class Square extends Shape{
	public void draw() {
		System.out.println("Drawing square");
	}
	public void erase() {
		System.out.println("Erasing square");
     }
}
class Triangle extends Shape{
	public void draw() {
		System.out.println("Drawing traingle");
	}
	public void erase() {
		System.out.println("Erasing traingle");
	}
}

class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape n=new Shape();
		Circle cir=new Circle();
	    Triangle tri=new Triangle();
	    Square sq=new Square();
		Shape c=new Circle();
		c.draw();
		c.erase();
		Shape s=new Square();
		s.draw();
		s.erase();
		Shape t=new Triangle();
		t.draw();
		t.erase();
	
		
	
	}
}


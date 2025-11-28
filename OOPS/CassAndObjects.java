package OOPS;
class Box{
	int d;
	int w;
	int h;
	
	Box(int d,int w,int h){
		this.d=d;
		this.w=w;
		this.h=h;
		
	}
	void Volume() {
	    int v;
		v=d*w*h;
		System.out.println("The volume of box is:"+v);
	}
}
public class CassAndObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box(10,30,20);
		b.Volume();
		
		

	}

}

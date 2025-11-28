package Java8features;

public class InstanceMethodRef1 {

	public void m1() {
		for(int i=0;i<=6;i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		InstanceMethodRef1 im=new InstanceMethodRef1();
		
		Runnable r=im::m1;
		
		Thread t=new Thread();
		t.start();
 
	}

}

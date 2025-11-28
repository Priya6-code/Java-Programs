package Strings;

public class StringBufferSynchronizedDemo   
{
     
	public static void main(String[] args) throws InterruptedException{
 
		StringBuffer sb=new StringBuffer("Priya");
		
		Thread t=new Thread(()->{
				for(int i=1;i<=5;i++) {
					sb.append("A");
				}
				System.out.println(sb);
		});
		
		System.out.println(sb);
		Thread t1=new Thread(()->{
			
			for(int j=1;j<5;j++) {
				sb.append("B");
			}
			System.out.println(sb);	
		});
		
		System.out.println(sb);
		t.start();
		t1.start();
		
	}

}

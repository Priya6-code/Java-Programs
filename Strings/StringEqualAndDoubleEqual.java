package Strings;

public class StringEqualAndDoubleEqual {

	public static void main(String[] args) {


		String s=new String("Priya");
		String p=new String("Priya");
		//System.out.println(s==p);
		//System.out.println(s.equals(p));
		
		System.out.println(s==p.intern());
		System.out.println(s.intern()==p.intern());
		

	}

}

package Strings;

public class StringImmutability {

	public static void main(String[] args) {


		String s1="Priya";
		String s2=s1;
		System.out.println("before changing"+s1);
		System.out.println("before changing"+s2);
		
		 s1=s1.concat("Srinivas");
		System.out.println("after changing"+s1);
		System.out.println("after changing"+s2);
		
		
	}

}

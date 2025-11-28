package Strings;

public class StringOperationsDemo1 {

	public static void main(String[] args) {
		
		/*String s="Priya is a Java Developer";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.indexOf('J'));
		System.out.println(s.lastIndexOf('e'));
		System.out.println(s.substring(1,5)); */
		
		//String s1="I like Java Programming";
		//System.out.println(s1.replace("Java","Python"));
		//System.out.println(s1.replaceAll("a","e"));
		//System.out.println(s1.contains("Java"));
		
		//System.out.println("java"+10+20);
		//System.out.println(10+20+"java");
		
		String s1="Priya";
		String s2=new String("Priya").intern();
		System.out.println(s1==s2);
		       	 
	}

}


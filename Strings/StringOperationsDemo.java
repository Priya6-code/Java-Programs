package Strings;

public class StringOperationsDemo {

	public static void main(String[] args) {

        String s="JavaConceptoftheday".substring(4);
        System.out.println(s);
        
        String s1="JavaConceptoftheday".repeat(4);
        System.out.println(s1.length());  
        
        String p="Priyanka";
        p=p.concat("Srinivas");
        System.out.println(p);
        System.out.println(p.charAt(9)); 
		
		String m="Java";
		String n="java";
		System.out.println(m.equals(n));
		System.out.println(m.equalsIgnoreCase(n));
		
        System.out.println(m.compareTo("Priya"));
        System.out.println(n.compareTo("java")); 
        
 
	}

}

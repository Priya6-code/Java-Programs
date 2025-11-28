package javafundamentals;

public class StringDemo {

	public static void main(String[] args) {

         String s1="Priya";
      
         System.out.println(s1);
         String s2="Priya";
         System.out.println(s1.hashCode());
         System.out.println(s2.hashCode());
         s2.intern();
         System.out.println("he "+s2.hashCode());
         
         String s3=new String("riya");
         String s4=new String("iya");
         
         System.out.println(s3.hashCode());
         System.out.println(s4.hashCode());
         

	}

}

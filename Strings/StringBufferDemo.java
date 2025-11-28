package Strings;

public class StringBufferDemo {

	public static void main(String[] args) {

          StringBuffer sb=new StringBuffer("Hello");
          sb.append("Priya");
          sb.append("How r u");
          System.out.println(sb);
          System.out.println(sb.hashCode());
          
          StringBuffer sb1=new StringBuffer("Hi");
          sb1.append("How");
          sb1.append("r u");
          System.out.println(sb1);
          System.out.println(sb1.hashCode());
          
          

	}

}

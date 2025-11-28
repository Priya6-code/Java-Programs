package Strings;

public class StringBuilderDemo {

	public static void main(String[] args) {


		StringBuilder sb=new StringBuilder("Hello");
        sb.append("Priya");
        sb.append("How r u");
        System.out.println(sb);
        System.out.println(sb.hashCode());
        
        StringBuilder sb1=new StringBuilder("Hi");
        sb1.append("How");
        sb1.append("r u");
        System.out.println(sb1);
        System.out.println(sb1.hashCode());

	}

}

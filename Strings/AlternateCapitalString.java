package Strings;

public class AlternateCapitalString {

	public static void main(String[] args) {
		
		String s="Hello Priyanka";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				sb.append(Character.toUpperCase(s.charAt(i)));
			}
			else {
				sb.append(s.charAt(i));
			}
		}
      System.out.println(sb);
	}

}

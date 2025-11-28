package Strings;

public class FirstAndLastUpperCase {
	
	public static String FirstLast(String str) {

		if(str==null|| str.length()==0) {
			return str;
		}
		
		else if(str.length()==1){
			return str.toUpperCase();
		}
		
			char f=Character.toUpperCase(str.charAt(0));
			
			char l=Character.toUpperCase(str.charAt(str.length()-1));
			
			String m=str.substring(1,str.length()-1);
		
			return f+m+l;
		
		
	}
	public static void main(String[] args) {

			String input="Priyanka";
			
			String result = FirstLast(input);
	        System.out.println(result);
			
		

	}

}

package Strings;

public class CountUpperCaseandLowerCase {

	public static void main(String[] args) {

     String s="PriYaNka";
     int u=0,l=0;
     for(int i=0;i<s.length();i++) {
    	 if(Character.isUpperCase(s.charAt(i))) {
    		 u++;
    	 }
    	 else {
    		 l++;
    	 }
     }
    System.out.println(u);
    System.out.println(l);
		
	}

}

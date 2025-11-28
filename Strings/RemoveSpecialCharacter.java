package Strings;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {

		String s="Pri@%&!#^riyanka";
		
		String res=s.replaceAll("[^a-zA-Z]","");
		
		System.out.println(res);

	}

}

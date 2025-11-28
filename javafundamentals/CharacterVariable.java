package javafundamentals;

public class CharacterVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='a';
		if(ch>='a'||ch<='z') {
			System.out.println("Alphabet");
			
		}
		else if(ch>=97||ch<=103){
			System.out.println("Digit");
			
		}
		else {
			System.out.println("Special Character");
		}

	}

}

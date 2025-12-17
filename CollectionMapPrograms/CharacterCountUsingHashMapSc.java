package CollectionMapPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterCountUsingHashMapSc {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		HashMap<Character,Integer> hm=new HashMap<>();
		System.out.println("Enter no of names");
		int n=s.nextInt();
		s.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("Enter names");
			String snames=s.nextLine();
			for(char c:snames.toCharArray()) {
				hm.put(c,hm.getOrDefault(c,0)+1);
			}
		}
		System.out.println(hm);

	}

}

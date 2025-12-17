package CollectionMapPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharacterCountUsingSc {

	public static void main(String[] args) {

            Scanner s=new Scanner(System.in);
            System.out.println("enter num of words");
            int n=s.nextInt();
            s.nextLine();
            List<String> l=new ArrayList<>();
            int count=0;
            for(int i=0;i<n;i++) {
            	System.out.println("Enter names");
            	String names=s.nextLine();
            	l.add(names);
            	count+=names.length();
            	
            }
            System.out.println("Character count " + count);

	}

}

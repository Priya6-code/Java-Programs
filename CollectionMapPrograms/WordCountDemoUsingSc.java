package CollectionMapPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class WordCountDemoUsingSc {

	public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter num of entries");
        int n=s.nextInt();
        s.nextLine();
        HashMap<String,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++) {
        	System.out.println("Enter names");
        	String names=s.nextLine();
        	hm.put(names,hm.getOrDefault(names,0)+1); 	
        }
        System.out.println(hm);
        
        

	}

}

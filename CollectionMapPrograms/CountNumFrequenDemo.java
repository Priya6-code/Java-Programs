package CollectionMapPrograms;
import java.util.*;
public class CountNumFrequenDemo {

	public static void main(String[] args) {

		System.out.println("Enter num of entries");
        Scanner s=new Scanner(System.in);
        
        HashMap<String,Integer> hm=new HashMap<>();
        int n=s.nextInt();
        s.nextLine();
        for(int i=0;i<n;i++) {
        	System.out.println("Enter names");
        	
        	String names=s.nextLine();    		
        	hm.put(names,hm.getOrDefault(names,0)+1);
      	
        }
        System.out.println(hm);
    
    

	}

}

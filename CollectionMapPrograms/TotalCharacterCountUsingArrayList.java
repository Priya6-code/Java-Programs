package CollectionMapPrograms;

import java.util.Arrays;
import java.util.List;

public class TotalCharacterCountUsingArrayList {

	public static void main(String[] args) {

       List<String> l=Arrays.asList("java","python","c");
      
       int count=0;
       for(String s:l) {
    	   count+=s.length();
       }
       System.out.println("charcter count " + count);
	}

}

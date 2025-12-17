package CollectionMapPrograms;


import java.util.TreeMap;

public class CountNumOfFreqUsingTreeMap {

	public static void main(String[] args) {

		String names[]= {"Priya","Ram","Priya","Ram"};
        TreeMap<String,Integer> tm=new TreeMap<>();
        
        for(int i=0;i<names.length;i++) {
        	tm.put(names[i],tm.getOrDefault(names[i],0)+1);
        }
       System.out.println(tm);

	}

}

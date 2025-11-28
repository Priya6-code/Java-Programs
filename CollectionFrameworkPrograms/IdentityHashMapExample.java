package CollectionFrameworkPrograms;

import java.util.IdentityHashMap;

public class IdentityHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*IdentityHashMap<Integer,String> ihm=new IdentityHashMap<Integer,String>();
		ihm.put(1,"Bhargav");
		ihm.put(2,"Priyanka");
		ihm.put(3,"Srinivas");
		System.out.println("The ele"+ihm);
		//ihm.remove(3);
		//System.out.println("After removing"+ihm);
		System.out.println("The ele"+ihm.get(2));
		System.out.println("The ele"+ihm.containsKey(1));
		System.out.println("The value"+ihm.containsValue(3));*/
		
		IdentityHashMap<Integer,String> ihmp=new IdentityHashMap<Integer,String>();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		ihmp.put(i1,"John");
		ihmp.put(i2,"Smith"); 
		System.out.println("The out"+i1.equals(i2));
		System.out.println("The compa"+(i1==i2));
		System.out.println("The output"+ihmp);

	}

}

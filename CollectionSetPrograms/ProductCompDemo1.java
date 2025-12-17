package CollectionSetPrograms;

import java.util.TreeSet;

public class ProductCompDemo1 {

	public static void main(String[] args) {

        TreeSet<ProductDemo> ts=new TreeSet<>();
        ts.add(new ProductDemo(1,"Book",550.3));
        ts.add(new ProductDemo(5,"Book",150.98));
        ts.add(new ProductDemo(2,"Book",250.3));
        ts.add(new ProductDemo(9,"Book",950.8));
        ts.add(new ProductDemo(3,"Book",50.3));
        System.out.println(ts);
        
	}

}

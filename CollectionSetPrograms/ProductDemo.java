package CollectionSetPrograms;

public class ProductDemo implements Comparable<ProductDemo>{

	int pid;
	String pname;
	Double price;
	
	ProductDemo(int pid,String pname,Double price){
		this.pid=pid;
		this.pname=pname;
		this.price=price;
		
	}
	
	public int compareTo(ProductDemo p) {
		
		return (int) (p.price-this.price);
		
	}

    public String toString() {
    	return pid+" " +pname+ " " +price;
    }
	
	}

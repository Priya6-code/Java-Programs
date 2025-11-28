package Java8featuresPrograms;

public class GenericsUsingConstructor<T1,T2> {
	
	T1 obj1;
	T2 obj2;
	
	GenericsUsingConstructor(T1 obj1,T2 obj2){
		
		this.obj1=obj1;
		this.obj2=obj2;		
	}
	
	void print() {
		System.out.println(obj1+" "+obj2);
	}

	public static void main(String[] args) {
		
		GenericsUsingConstructor<Integer,String> d=new GenericsUsingConstructor<>(101,"Priya");
        d.print();
		
		GenericsUsingConstructor<String,Double> d1=new GenericsUsingConstructor<>("Priya",10.89);
		d1.print();
		
		GenericsUsingConstructor<Integer,Boolean> d2=new GenericsUsingConstructor<>(101,false);
		d2.print();
		

	}

}

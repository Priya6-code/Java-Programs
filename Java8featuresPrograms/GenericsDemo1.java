package Java8featuresPrograms;

public class GenericsDemo1<T> {
	
	T obj;
	public void add(T obj) {
		this.obj=obj;
	}
	T get()
	{	
		return obj;
	}

	public static void main(String[] args) throws Exception{

		GenericsDemo1<Integer> d=new GenericsDemo1<>();
		d.add(10);
		System.out.println(d.get());
		
		GenericsDemo1<String> d1=new GenericsDemo1<>();
		d1.add("HI");
		System.out.println(d1.get());
		
		GenericsDemo1<Double> d2=new GenericsDemo1<>();
		d2.add(10.5);
		System.out.println(d2.get());
		

	}

}

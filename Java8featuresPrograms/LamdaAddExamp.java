package Java8featuresPrograms;

public class LamdaAddExamp implements LambdaAddDemo {
	
	public int add(int a,int b) {
		return b ;
		
	}

	public static void main(String[] args) {

        LambdaAddDemo l=(a,b)-> a+b;
        System.out.println("sum is " +l.add(10,30));

	}

}

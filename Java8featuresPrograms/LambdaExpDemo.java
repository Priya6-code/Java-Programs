package Java8featuresPrograms;

public class LambdaExpDemo implements LambdaInter{

	@Override
	public void show() {
	
		
	}
	
	public static void main(String[] args) {

        LambdaInter l=()->System.out.println("Interface method called using lamda exp");
         l.show();
	}

	

}

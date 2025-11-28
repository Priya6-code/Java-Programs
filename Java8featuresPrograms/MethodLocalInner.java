package Java8featuresPrograms;

public class MethodLocalInner {
	
	void Local() {
		class Inner{
			void show() {
				System.out.println("Hello Good Morning");
			}	
		}
		Inner i=new Inner();
		i.show();
		
	}

	public static void main(String[] args) {
		
   MethodLocalInner obj= new  MethodLocalInner();
   obj.Local();

	}

}

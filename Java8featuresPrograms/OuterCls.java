package Java8featuresPrograms;

public class OuterCls {
	
	class InnerCls{
		
		void show() {
			System.out.println("Hello");
		}
	}

	
	public static void main(String[] args) {

      OuterCls o=new OuterCls();
      OuterCls.InnerCls i=o.new InnerCls();
      i.show();

	}

}

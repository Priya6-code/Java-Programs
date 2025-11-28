package Java8featuresPrograms;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

      Supplier<String> sp=()->{
    	  String otp="";
    	  for(int i=0;i<=5;i++) {
    		 otp+=(int) (Math.random()*10);
    	  }
    	  return otp;
      };
      System.out.println(sp.get());
      System.out.println(sp.get());
      System.out.println(sp.get());
      System.out.println(sp.get());
      

	}

}

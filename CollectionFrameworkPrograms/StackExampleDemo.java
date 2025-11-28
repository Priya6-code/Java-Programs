package CollectionFrameworkPrograms;

import java.util.Stack;

public class StackExampleDemo {

	public static void main(String[] args) {
		

         Stack<Double> s=new Stack<Double>();
         s.push(10.77);
         s.push(909443.00);
         s.push(3434343.9384395);
         System.out.println(s.pop());
         System.out.println(s.peek());
         s.push(89348.4393);
         System.out.println("The final stack elem are :"+s);
         

	}

}

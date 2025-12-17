package CollectionFrameworkPrograms;

import java.util.Stack;

public class StackImplemenDemo {

	public static void main(String[] args) {


		Stack<Integer> s=new Stack<>();
		
		s.push(10);
		s.push(18);
		s.push(60);
		s.push(56);
		
		System.out.println(s);
		
		System.out.println("the first ele is"+s.peek());
		
		if(s.isEmpty()) {
			System.out.println("stack is empty");
		}
		

	}

}

package Java8featuresPrograms;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
	StringJoiner sj=new StringJoiner("-");
	sj.add("Priya");
	sj.add("Deepu");
	sj.add("Ram");
	System.out.println("The output is" +sj);
	
	StringJoiner sj1=new StringJoiner("->");
	sj1.add("Priya");
	sj1.add("Deepu");
	sj1.add("Ram");
	System.out.println("The output is" +sj1);
	

	}

}

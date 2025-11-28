
package javafundamentals;
import java.util.Scanner;
public class Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter color code");
        String s=sc.nextLine();
        
        switch(s.toUpperCase()) {
        case "R":
        	System.out.println("Red");
        	break;
        case "W":
        	System.out.println("White");
        	break;
        case "G":
        	System.out.println("Green");
        	break;
        case "O":
        	System.out.println("Orange");
        	break;
        case "Y":
        	System.out.println("Yellow");
        	break;
        default:
        	System.out.println("Invalid color");
        }
	}

}

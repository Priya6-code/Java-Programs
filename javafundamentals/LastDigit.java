package javafundamentals;

public class LastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=2) {
			return ;
		}
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        if(x<0||y<0) {
        	System.out.println("Give Non-negative integers");
        	return;
        }
        
        	int a=x%10;
        	int b=y%10;
        	
        if(a==b) {
            System.out.println("true");
        }
        else {
        	System.out.println("false");
        }
	}

}

package javafundamentals;

public class Company {

	public static void main(String[] args) 
	{

		if(args.length!=2) {
			
			return;
		}
		String companyname=args[0];
		String location=args[1];
		System.out.println(companyname +"Technologies"+ location);

	}

}

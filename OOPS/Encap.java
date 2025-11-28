package OOPS;
class Author{
	String name;
	String email;
	char gender;

Author(String name,String email,char gender){
	this.name=name;
	this.email=email;
	this.gender=gender;
	
}
public void displayDetails() {
	System.out.println("Name: " +name);
	System.out.println("Name: " +email);
	System.out.println("Name: " +gender);
}
public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a =new Author("Priya","melampriyanka1@gmail.com",'F');
		a.displayDetails();
		
		
		
		

	}

}
}

package OOPS;


public class Employee extends Person {
	double salary;
  int year;
  String ins;

 public Employee(String name,double salary, int year, String ins) {
     super(name); 
     this.salary=salary;
     this.year = year;
     this.ins = ins;
 }


 public int getYear() {
     return year;
 }
 public double getSal() {
     return salary;
 }

 
 public String getIns() {
     return ins;
 }
 

}
	


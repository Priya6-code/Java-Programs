package Java8features;

import java.util.function.Supplier;

class Doctor{
	Doctor(){
		System.out.println("This is doctor constructor");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Doctor> s=Doctor::new;
		Doctor doctor = s.get();
		System.out.println(doctor.hashCode());


	}

}

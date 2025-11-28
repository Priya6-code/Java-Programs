package Java8featuresPrograms;

import java.util.Optional;

public class OptionalClassDemo {
		
		public static Optional<String> getUserName(Integer id){
			
			String name=null;
			if(id==1) {
				name="Priya";
				
			}else if(id==2) {
				name="Ram";
			}else if(id==3) {
				name="Rani";
			}
			return Optional.ofNullable(name);
		}

		public static void main(String[] args) {

			Optional<String> res= getUserName(2);
			System.out.println(res.orElse("User not found"));
}
}
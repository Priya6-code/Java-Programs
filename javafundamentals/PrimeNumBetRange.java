package javafundamentals;
public class PrimeNumBetRange {

		// TODO Auto-generated method stub
		public static boolean PrimeBet(int num) {
			if(num<2) {
				System.out.println("Invalid num,num must be greater than 2");
			}
			else {
			for(int i=2;i<Math.sqrt(num);i++) {
				if(num%i==0) {
				return false;
			}
		}
			
	}
	return true;
		}
	public static void main(String[] args) {	
		int start=70;
		int end=100;
		
		for(int i=start;i<end;i++) {
			
			if(PrimeBet(i)) {
				System.out.println(i+ "");
			}
		}

}
}
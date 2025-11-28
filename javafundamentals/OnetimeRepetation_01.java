package javafundamentals;

public class OnetimeRepetation_01 {

	public static void main(String[] args) {


		int arry[]= {1,2,3,4,1,2,3,4,4,1,2,3,3,3,3,2,2,2,1,1,5,6,7,8,};
		
		
		for(int i=0; i<=arry.length-1; i++) {
			
			int count=0;
			for(int j=i+1; j<=arry.length-1; j++) {
				
				if(arry[i]==arry[j]) {
					arry[j]=0;
					count++;
				}
			}
			if(count>1 && arry[i]!=0) {
				System.out.println(arry[i]);
			}
			
		}

	}

}

package javafundamentals;

public class FindingDuplicatesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "priya is a java developer";
		s=s.replace(" ","");
		// this loop for taking each ch in a string
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			int count=1;			
			if(ch=='0') 
				continue;
			// for comparing a with rest of values  
			for(int j=i+1;j<s.length();j++) {
				if(ch==s.charAt(j)) {
					count++;
					
					
				}
			}
			
		}
		
		
		}

	}



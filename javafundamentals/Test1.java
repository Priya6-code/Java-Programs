package javafundamentals;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]= {"priya","anilkumar","sunilkumar","manilkuar","nil","ni"};

        for (String str : arr) {
            boolean found = false;
		
		for (int i = 0; i <= str.length() - 3; i++) {
            if (str.charAt(i) == 'n' &&
                str.charAt(i + 1) == 'i' &&
                str.charAt(i + 2) == 'l') {
                found = true;
                break;
            }
			}
		if(found) {
			System.out.println(" output " + str);
		}

	}


	}
}

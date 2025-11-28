package ArraysInJava;

public class FindUniqueEle {
       public static void Unique(){
        int arr[]= {1,2,2,1,5,6,7,9,0,0};
        boolean isunique=false;
    	 for(int i=0;i<arr.length;i++) {
    		  boolean  found=false;
    		 for(int j=0;j<arr.length;j++) {
    			 if(i!=j&&arr[i]==arr[j] ){
    				 found =true;
    				 break;		 
    			 }
    			 
    		 }
    		 if(!found) {
    			 System.out.println(arr[i]+ "");
    			 isunique=true;
    		 }
    		 
    	 }
     }
     public static void main(String[] args) {
    	 
    	  Unique();
    	 
    	 
	}

}

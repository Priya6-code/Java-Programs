package OOPS;

public class StrCo {
    
    public static void main(String[] args) {
        
        
       
        
        String result = concatenateAndRemoveDoubleChar("hello", "oleo");
        System.out.println(result); 
    }
    
    public static String concatenateAndRemoveDoubleChar(String str1, String str2) {
        // Check if the last character of str1 is the same as the first character of str2
        if (!str1.isEmpty() && !str2.isEmpty() && str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            // Concatenate str1 with the substring of str2 starting from index 1
            return (str1 + str2.substring(1)).toLowerCase();
        } else {
            // Concatenate the strings as they are
            return (str1 + str2).toLowerCase();
        }
    }
}

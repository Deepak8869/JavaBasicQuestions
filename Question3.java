//String is palindrome or not//
public class Question3 {
    static boolean palindrome(String str){//Brute force approach
        String string = "";
        for(int i = str.length()-1;i>=0;i--){
           string += str.charAt(i);
        }
        if(str.equals(string)){
            return true;
        }
        else{
        return false;
        }
    }
    static boolean palindromeString(String s){//Best approach
        int i = 0;
        int j = s.length() -1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j) )
                return false;
                i++;
                j--;
        }
            return true;  

    }
    public static void main(String[] args) {
        String s = "OYO";
        
        System.out.println(palindrome(s));
        System.out.println(palindromeString(s));
    }
    
}

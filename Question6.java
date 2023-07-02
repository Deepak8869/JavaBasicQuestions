//Count the number of words//

public class Question6 {
    static int countWords(String s){
        int count = 1;
        for(int i = 0 ;i<s.length();i++){
            if((s.charAt(i) == ' ') && (s.charAt(i+1) != ' ')){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "welcome to java   tutorial on Java2blog";
        System.out.println(countWords(s));
    }

}

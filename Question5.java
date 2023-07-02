//Remove all the special character in the string//

public class Question5 {
    static void  remove(String s){
       String result = s.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.println(result);
    }
    public static void main(String[] args) {
        String se = "This#string%contains^special*characters&.";  
        remove(se);
        
    }
}
